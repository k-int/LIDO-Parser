package app.java.parser.dao.element.leaf.resource;

import app.java.parser.model.element.leaf.resource.ResourceRelType;
import org.w3c.dom.Node;

public interface ResourceRelTypeDAO {
	/**
	 *
	 * @param node <b>lido:resourceRelType</b> node type.
	 * @return <b>ResourceRelType</b>
	 */
	ResourceRelType getResourceRelType(Node node);
}
