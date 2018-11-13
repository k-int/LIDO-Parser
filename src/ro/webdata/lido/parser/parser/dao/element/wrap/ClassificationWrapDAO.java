package ro.webdata.lido.parser.parser.dao.element.wrap;

import ro.webdata.lido.parser.parser.model.element.wrap.ClassificationWrap;
import org.w3c.dom.Node;

public interface ClassificationWrapDAO {
	/**
	 *
	 * @param node <b>lido:classificationWrap</b> node type.
	 * @return <b>ClassificationWrap</b>
	 */
	ClassificationWrap getClassificationWrap(Node node);
}
