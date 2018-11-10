package app.java.parser.model.element.leaf.record;

import app.java.parser.model.attribute.lido.LidoEncodingAnalog;
import app.java.parser.model.attribute.lido.LidoLabel;
import app.java.parser.model.attribute.lido.LidoSource;
import app.java.parser.model.attribute.lido.LidoType;
import app.java.parser.model.attribute.xml.XmlLang;
import app.java.parser.model.complex.TextComplexType;

/**<link rel="stylesheet" type="text/css" href="../../../../../javadoc.css"/>
 * <div class="lido">
 * 	<div class="lido-title">Lido documentation:</div>
 * 	<div class="lido-doc">
 * 		<b>Definition:</b> Creation date or date modified of the metadata record.
 * 		Format will vary depending upon implementation.<br/>
 *
 * 		<b>Attributes:</b>
 * 		<div class="lido-attr">
 * 			<b>type (lido:type)</b><br/>
 * 			<b>source (lido:source)</b>
 * 		</div>
 * 	</div>
 * </div>
 * @author WebData
 *
 */
public class RecordMetadataDate extends TextComplexType {
	private LidoType type;
	private LidoSource source;

	public RecordMetadataDate() {}

	public RecordMetadataDate(TextComplexType textComplexType, LidoType type, LidoSource source) {
		super(
			textComplexType.getText(),
			textComplexType.getLang(),
			textComplexType.getEncodingAnalog(),
			textComplexType.getLabel()
		);
		setType(type);
		setSource(source);
	}

	public RecordMetadataDate(String text, XmlLang lang, LidoEncodingAnalog encodingAnalog, LidoLabel label,
			LidoType type, LidoSource source) {
		this.setText(text);
		this.setLang(lang);
		this.setEncodingAnalog(encodingAnalog);
		this.setLabel(label);
		this.setType(type);
		this.setSource(source);
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
}
