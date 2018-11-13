package ro.webdata.lido.parser.parser.dao.element.leaf.object;

import ro.webdata.lido.parser.parser.model.element.leaf.object.ObjectWebResource;
import org.w3c.dom.Node;

public interface ObjectWebResourceDAO {
	/**
	 *
	 * @param node <b>lido:objectWebResource</b> node type.
	 * @return <b>ObjectWebResource</b>
	 */
	ObjectWebResource getObjectWebResource(Node node);
}
