import java.io {
	JFile=File
}
import java.util.regex {
	Pattern
}

import javax.xml.bind {
	JAXBContext,
	UnmarshalException,
	Unmarshaller
}

import pl.drabik.opensongcleaner.opensong {
	OpenSongSong
}

import java.lang {
	Types {
		nativeString
	}
}

shared interface Cleanable {
	shared formal void clean();
}

class HymnBook({Cleanable*} songs) satisfies Cleanable {
	shared actual void clean() {
		// this does not work - static method reference (possible ceylon bug)
		// songFiles.flatMap(mapping.map).each(Cleanable.clean);
		// so I must use this:
		songs.each(Cleanable.clean);
	}
}

shared interface PresentationListener {
	shared formal void onSame();
	shared formal void onNew();
	shared formal void onDifferent();
}

shared class PresentationCorrectingSong(
	SongPresentation _existingPresentation,
	{Character*} _newPresentation,
	Presentable song,
	PresentationListener listener) satisfies Cleanable {
	shared actual void clean() {
		value existingPresentation = _existingPresentation.presentation;
		value newPresentation = String(_newPresentation);
		
		if (existingPresentation == newPresentation) {
			listener.onSame();
		} else if (existingPresentation.empty) {
			song.setPresentation(newPresentation);
			listener.onNew();
		} else {
			listener.onDifferent();
		}
	}
}

shared interface SongLyrics {
	shared formal String lyrics;
}

shared interface SongPresentation {
	shared formal String presentation;
}

class SongFile(Provider<OpenSongSong> openSongSong) satisfies SongLyrics & SongPresentation {
	shared actual String lyrics => openSongSong.get().lyrics;
	shared actual String presentation => openSongSong.get().presentation;
}

class OpenSongSongTitle(Provider<OpenSongSong> song) satisfies {Character*} {
	shared actual Iterator<Character> iterator() => song.get().title.iterator();
}

class OpenSongSongHymnNumber(Provider<OpenSongSong> song) {
	shared actual String string => song.get().hymnNumber.string;
}

shared interface Presentable {
	shared formal void setPresentation(String presentation);
}

class PresentableSongFile(TextFile file) satisfies Presentable {
	
	shared actual void setPresentation(String presentation) {
		value content = file.content();
		value matcher = Pattern.compile("(\\<presentation\\>(.*)\\<\\/presentation\\>)").matcher(nativeString(content));
		if (matcher.find()) {
			file.replaceContent(
				content.replaceFirst(matcher.group(1), "<presentation>" + presentation + "</presentation>")
			);
		} else {
			throw Exception("File without presentation element: " + file.name);
		}
	}
}

"Extensionless - do not contain dot ('.')"
shared class OpenSongFiles<N>(Iterable<N> files) satisfies Iterable<N> given N satisfies Named {
	
	Boolean isExtensionLess(Named file) => !file.name.contains('.');
	
	shared actual Iterator<N> iterator() => files.filter(isExtensionLess).iterator();
}

class OpenSongSongSerializerException() extends Exception() {
}

class XmlFileOpenSongSongProvider(JAXBContext jaxbContext, MyFile file) satisfies Provider<OpenSongSong> {
	shared actual OpenSongSong get() {
		Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
		JFile jFile = JFile(file.path.string);
		try {
			Object openSongSong = jaxbUnmarshaller.unmarshal(jFile);
			assert (is OpenSongSong openSongSong);
			return openSongSong;
		} catch (UnmarshalException e) {
			//			log.log("WARNING", "Súbor nemá štruktúru OpenSong piesne.");
			throw OpenSongSongSerializerException();
		}
	}
}

shared interface RenamingListener {
	shared formal void onRename(String newName);
}