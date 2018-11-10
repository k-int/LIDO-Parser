package app.java.parser.dao.element.leaf.resource;

import app.java.parser.model.element.leaf.resource.ResourceType;
import org.w3c.dom.Node;

public interface ResourceTypeDAO {
	/**
	 *
	 * @param node <b>lido:resourceType</b> node type.
	 * @return <b>ResourceType</b>
	 */
	ResourceType getResourceType(Node node);
}
