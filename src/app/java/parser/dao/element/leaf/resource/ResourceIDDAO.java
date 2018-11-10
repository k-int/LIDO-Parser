package app.java.parser.dao.element.leaf.resource;

import app.java.parser.model.element.leaf.resource.ResourceID;
import org.w3c.dom.Node;

public interface ResourceIDDAO {
	/**
	 *
	 * @param node <b>lido:resourceID</b> node type.
	 * @return <b>ResourceID</b>
	 */
	ResourceID getResourceID(Node node);
}
