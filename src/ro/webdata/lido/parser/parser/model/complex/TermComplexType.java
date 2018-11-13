package ro.webdata.lido.parser.parser.model.complex;

import ro.webdata.lido.parser.parser.model.attribute.lido.LidoAddedSearchTerm;
import ro.webdata.lido.parser.parser.model.attribute.lido.LidoEncodingAnalog;
import ro.webdata.lido.parser.parser.model.attribute.lido.LidoLabel;
import ro.webdata.lido.parser.parser.model.attribute.lido.LidoPref;
import ro.webdata.lido.parser.parser.model.attribute.xml.XmlLang;

/**<link rel="stylesheet" type="text/css" href="../../../javadoc.css"/>
 * <div class="lido">
 * 	<div class="lido-title">Lido documentation:</div>
 * 	<div class="lido-doc">
 * 		<b>Definition:</b> A name for a concept / term, usually from a controlled vocabulary.<br/>
 *
 * 		<b>Elements:</b>
 * 		<div class="lido-elem">
 * 			<b>text (xsd:string)</b>
 * 			<div class="lido-elem-doc">
 * 				<b>Definition:</b> The text content of the node.
 * 			</div>
 * 		</div>
 *
 * 		<b>Attributes:</b>
 * 		<div class="lido-attr">
 * 			<b>pref (lido:pref)</b><br/>
 * 			<b>addedSearchTerm (lido:addedSearchTerm)</b><br/>
 * 			<b>lang (xml:lang)</b><br/>
 * 			<b>encodingAnalog (lido:encodinganalog)</b><br/>
 * 			<b>label (lido:label)</b><br/>
 * 		</div>
 * 	</div>
 * </div>
 * @author WebData
 *
 */
public class TermComplexType {
	private String text;
	private LidoPref pref;
	private LidoAddedSearchTerm addedSearchTerm;
	private XmlLang lang;
	private LidoEncodingAnalog encodingAnalog;
	private LidoLabel label;

	public TermComplexType() {}

	public TermComplexType(String text, LidoPref pref, LidoAddedSearchTerm addedSearchTerm,
			XmlLang lang, LidoEncodingAnalog encodingAnalog, LidoLabel label) {
		setText(text);
		setPref(pref);
		setAddedSearchTerm(addedSearchTerm);
		setLang(lang);
		setEncodingAnalog(encodingAnalog);
		setLabel(label);
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text.trim();
	}

	public LidoPref getPref() {
		return pref;
	}

	public void setPref(LidoPref pref) {
		this.pref = pref;
	}

	public LidoAddedSearchTerm getAddedSearchTerm() {
		return addedSearchTerm;
	}

	public void setAddedSearchTerm(LidoAddedSearchTerm addedSearchTerm) {
		this.addedSearchTerm = addedSearchTerm;
	}

	public XmlLang getLang() {
		return lang;
	}

	public void setLang(XmlLang lang) {
		this.lang = lang;
	}

	public LidoEncodingAnalog getEncodingAnalog() {
		return encodingAnalog;
	}

	public void setEncodingAnalog(LidoEncodingAnalog encodingAnalog) {
		this.encodingAnalog = encodingAnalog;
	}

	public LidoLabel getLabel() {
		return label;
	}

	public void setLabel(LidoLabel label) {
		this.label = label;
	}
}
