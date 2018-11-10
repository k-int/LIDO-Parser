package app.java.parser.model.complex;

import app.java.parser.model.attribute.lido.LidoEncodingAnalog;
import app.java.parser.model.attribute.lido.LidoLabel;
import app.java.parser.model.attribute.lido.LidoPref;
import app.java.parser.model.attribute.lido.LidoSource;
import app.java.parser.model.attribute.lido.LidoType;
import app.java.common.PrintMessages;

/**<link rel="stylesheet" type="text/css" href="../../../javadoc.css"/>
 * <div class="lido">
 * 	<div class="lido-title">Lido documentation:</div>
 * 	<div class="lido-doc">
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
 * 			<b>type (lido:type) - REQUIRED</b><br/>
 * 			<b>source (lido:source)</b><br/>
 * 			<b>encodingAnalog (lido:encodinganalog)</b><br/>
 * 			<b>label (lido:label)</b>
 * 		</div>
 * 	</div>
 * </div>
 * @author WebData
 *
 */
public class IdentifierComplexType {
	private String text;
	private LidoPref pref;
	private LidoType type;
	private LidoSource source;
	private LidoEncodingAnalog encodingAnalog;
	private LidoLabel label;
	private PrintMessages printMessages = new PrintMessages();

	public IdentifierComplexType() {}

	public IdentifierComplexType(String text, LidoType type) {
		setText(text);
		setType(type);
	}

	public IdentifierComplexType(String text, LidoPref pref, LidoType type, LidoSource source,
			LidoEncodingAnalog encodingAnalog, LidoLabel label) {
		setText(text);
		setPref(pref);
		setType(type);
		setSource(source);
		setEncodingAnalog(encodingAnalog);
		setLabel(label);

		if (type == null) {
			printMessages.printUndefinedAttribute(DescriptiveMetadataComplexType.class, "lido:type");
		}
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

	public LidoType getType() {
		return type;
	}

	public void setType(LidoType type) {
		this.type = type;
	}

	public LidoSource getSource() {
		return source;
	}

	public void setSource(LidoSource source) {
		this.source = source;
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
