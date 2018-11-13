package ro.webdata.lido.parser.parser.dao.element.wrap;

import ro.webdata.lido.parser.parser.model.element.wrap.ObjectClassificationWrap;
import org.w3c.dom.Node;

public interface ObjectClassificationWrapDAO {
	/**
	 *
	 * @param node <b>lido:objectClassificationWrap</b> node type.
	 * @return <b>ObjectClassificationWrap</b>
	 */
	ObjectClassificationWrap getObjectClassificationWrap(Node node);
}
