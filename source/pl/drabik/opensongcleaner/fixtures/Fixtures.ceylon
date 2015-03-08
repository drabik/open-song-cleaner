import pl.drabik.opensongcleaner {
	createSongFilename,
	OpenSongSongProcessor,
	OpenSongPresentationComputer,
	ConstantPresentationComputer,
	createOpenSongSong
}
import pl.drabik.opensongcleaner.opensong {
	OpenSongSong
}
shared class VypocetPrezentacie() {
	
	shared variable String textPiesne = "";
	
	shared String prezentacia() {
		value song = OpenSongSong();
		song.lyrics =  textPiesne;
		song.presentation = "";
		
		value songProcessor = OpenSongSongProcessor(OpenSongPresentationComputer());
		songProcessor.computeAndReplacePresentation(song);
		
		return song.presentation;
	}
}

shared class NaplneniePrezentacie() {
	shared variable String staraHodnota = "";
	shared variable String vypocitanaHodnota = "";
	
	shared String novaHodnota() {
		
		value presentationComputer = ConstantPresentationComputer(vypocitanaHodnota);
		value openSongSongProcessor = OpenSongSongProcessor(presentationComputer);

		value song = createOpenSongSong(staraHodnota);
		
		try {
			openSongSongProcessor.computeAndReplacePresentation(song);
			return song.presentation;
		} catch (Exception e) {
			return "chyba[``e.message``]";
		}
	}
}

shared class NazovSuboruPiesne() {
	
	variable Integer cislo = 0;
	variable String nazov = "";
	
	shared void piesenSCislomANazvom(Integer cislo, String nazov) {
		this.cislo = cislo;
		this.nazov = nazov;
	}
	
	shared String nazovSuboru() {
		return createSongFilename(nazov,cislo);
	}
}