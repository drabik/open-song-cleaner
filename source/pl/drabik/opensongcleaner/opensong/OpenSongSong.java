//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.11.11 at 09:53:04 PM CET 
//


package pl.drabik.opensongcleaner.opensong;

import java.math.BigInteger;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OpenSongSong complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OpenSongSong">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="title" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="author" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="copyright" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="hymn_number" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *         &lt;element name="presentation" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ccli" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="capo" type="{}CapoType"/>
 *         &lt;element name="key" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="aka" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="key_line" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="user1" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="user2" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="user3" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="theme" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="tempo" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="time_sig" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="lyrics" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlRootElement(name = "OpenSongSong")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(propOrder = {
	"title",
    "author",
    "copyright",
    "hymnNumber",
    "presentation",
    "ccli",
    "capo",
    "key",
    "aka",
    "keyLine",
    "user1",
    "user2",
    "user3",
    "theme",
    "tempo",
    "timeSig",
    "lyrics"
})
public class OpenSongSong {

    @XmlElement(required = true)
    protected String title;
    @XmlElement(required = true)
    protected String author;
    @XmlElement(required = true)
    protected String copyright;
    @XmlElement(name = "hymn_number", required = true)
    protected BigInteger hymnNumber;
    @XmlElement(required = true)
    protected String presentation;
    @XmlElement(required = true)
    protected String ccli;
    @XmlElement(required = true)
    protected CapoType capo;
    @XmlElement(required = true)
    protected String key;
    @XmlElement(required = true)
    protected String aka;
    @XmlElement(name = "key_line", required = true)
    protected String keyLine;
    @XmlElement(required = true)
    protected String user1;
    @XmlElement(required = true)
    protected String user2;
    @XmlElement(required = true)
    protected String user3;
    @XmlElement(required = true)
    protected String theme;
    @XmlElement(required = true)
    protected String tempo;
    @XmlElement(name = "time_sig", required = true)
    protected String timeSig;
    @XmlElement(required = true)
    protected String lyrics;

    /**
     * Gets the value of the title property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTitle() {
        return title;
    }

    /**
     * Sets the value of the title property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTitle(String value) {
        this.title = value;
    }

    /**
     * Gets the value of the author property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAuthor() {
        return author;
    }

    /**
     * Sets the value of the author property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAuthor(String value) {
        this.author = value;
    }

    /**
     * Gets the value of the copyright property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCopyright() {
        return copyright;
    }

    /**
     * Sets the value of the copyright property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCopyright(String value) {
        this.copyright = value;
    }

    /**
     * Gets the value of the hymnNumber property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getHymnNumber() {
        return hymnNumber;
    }

    /**
     * Sets the value of the hymnNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setHymnNumber(BigInteger value) {
        this.hymnNumber = value;
    }

    /**
     * Gets the value of the presentation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPresentation() {
        return presentation;
    }

    /**
     * Sets the value of the presentation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPresentation(String value) {
        this.presentation = value;
    }

    /**
     * Gets the value of the ccli property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCcli() {
        return ccli;
    }

    /**
     * Sets the value of the ccli property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCcli(String value) {
        this.ccli = value;
    }

    /**
     * Gets the value of the capo property.
     * 
     * @return
     *     possible object is
     *     {@link CapoType }
     *     
     */
    public CapoType getCapo() {
        return capo;
    }

    /**
     * Sets the value of the capo property.
     * 
     * @param value
     *     allowed object is
     *     {@link CapoType }
     *     
     */
    public void setCapo(CapoType value) {
        this.capo = value;
    }

    /**
     * Gets the value of the key property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKey() {
        return key;
    }

    /**
     * Sets the value of the key property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKey(String value) {
        this.key = value;
    }

    /**
     * Gets the value of the aka property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAka() {
        return aka;
    }

    /**
     * Sets the value of the aka property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAka(String value) {
        this.aka = value;
    }

    /**
     * Gets the value of the keyLine property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKeyLine() {
        return keyLine;
    }

    /**
     * Sets the value of the keyLine property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKeyLine(String value) {
        this.keyLine = value;
    }

    /**
     * Gets the value of the user1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUser1() {
        return user1;
    }

    /**
     * Sets the value of the user1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUser1(String value) {
        this.user1 = value;
    }

    /**
     * Gets the value of the user2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUser2() {
        return user2;
    }

    /**
     * Sets the value of the user2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUser2(String value) {
        this.user2 = value;
    }

    /**
     * Gets the value of the user3 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUser3() {
        return user3;
    }

    /**
     * Sets the value of the user3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUser3(String value) {
        this.user3 = value;
    }

    /**
     * Gets the value of the theme property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTheme() {
        return theme;
    }

    /**
     * Sets the value of the theme property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTheme(String value) {
        this.theme = value;
    }

    /**
     * Gets the value of the tempo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTempo() {
        return tempo;
    }

    /**
     * Sets the value of the tempo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTempo(String value) {
        this.tempo = value;
    }

    /**
     * Gets the value of the timeSig property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTimeSig() {
        return timeSig;
    }

    /**
     * Sets the value of the timeSig property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTimeSig(String value) {
        this.timeSig = value;
    }

    /**
     * Gets the value of the lyrics property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLyrics() {
        return lyrics;
    }

    /**
     * Sets the value of the lyrics property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLyrics(String value) {
        this.lyrics = value;
    }

}
