package app.java.parser.dao.element.wrap;

import app.java.parser.model.element.wrap.ObjectClassificationWrap;
import org.w3c.dom.Node;

public interface ObjectClassificationWrapDAO {
	/**
	 *
	 * @param node <b>lido:objectClassificationWrap</b> node type.
	 * @return <b>ObjectClassificationWrap</b>
	 */
	ObjectClassificationWrap getObjectClassificationWrap(Node node);
}
