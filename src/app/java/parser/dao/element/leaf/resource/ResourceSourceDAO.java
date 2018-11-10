package app.java.parser.dao.element.leaf.resource;

import app.java.parser.model.element.leaf.resource.ResourceSource;
import org.w3c.dom.Node;

public interface ResourceSourceDAO {
	/**
	 *
	 * @param node <b>lido:resourceSource</b> node type.
	 * @return <b>ResourceSource</b>
	 */
	ResourceSource getResourceSource(Node node);
}
