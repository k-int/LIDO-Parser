package app.java.parser.dao.element.leaf.resource;

import app.java.parser.model.element.leaf.resource.ResourcePerspective;
import org.w3c.dom.Node;

public interface ResourcePerspectiveDAO {
	/**
	 *
	 * @param node <b>lido:resourcePerspective</b> node type.
	 * @return <b>ResourcePerspective</b>
	 */
	ResourcePerspective getResourcePerspective(Node node);
}
