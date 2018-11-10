package app.java.parser.dao.element.leaf.object;

import app.java.parser.model.element.leaf.object.ObjectWebResource;
import org.w3c.dom.Node;

public interface ObjectWebResourceDAO {
	/**
	 *
	 * @param node <b>lido:objectWebResource</b> node type.
	 * @return <b>ObjectWebResource</b>
	 */
	ObjectWebResource getObjectWebResource(Node node);
}
