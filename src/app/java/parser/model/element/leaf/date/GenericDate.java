package app.java.parser.model.element.leaf.date;

import app.java.parser.model.attribute.lido.LidoEncodingAnalog;
import app.java.parser.model.attribute.lido.LidoLabel;
import app.java.parser.model.attribute.lido.LidoSource;
import app.java.parser.model.attribute.lido.LidoType;

/**<link rel="stylesheet" type="text/css" href="../../../../javadoc.css"/>
 * The lido:earliestDate and the lido:latestDate node type
 * @author WebData
 *
 */
public class GenericDate {
	private String text;
	private LidoType type;
	private LidoSource source;
	private LidoEncodingAnalog encodingAnalog;
	private LidoLabel label;

	public GenericDate() {}

	public GenericDate(String text, LidoType type, LidoSource source, LidoEncodingAnalog encodingAnalog, LidoLabel label) {
		setText(text);
		setType(type);
		setSource(source);
		setEncodingAnalog(encodingAnalog);
		setLabel(label);
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text.trim();
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
