package ro.webdata.lido.parser.core.wrap.classificationWrap;

import org.w3c.dom.Node;

public interface ClassificationWrapDAO {
	/**
	 *
	 * @param node <b>lido:classificationWrap</b> node type.
	 * @return <b>ClassificationWrap</b>
	 */
	ClassificationWrap getClassificationWrap(Node node);
}
