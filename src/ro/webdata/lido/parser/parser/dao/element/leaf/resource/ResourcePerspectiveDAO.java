package ro.webdata.lido.parser.parser.dao.element.leaf.resource;

import ro.webdata.lido.parser.parser.model.element.leaf.resource.ResourcePerspective;
import org.w3c.dom.Node;

public interface ResourcePerspectiveDAO {
	/**
	 *
	 * @param node <b>lido:resourcePerspective</b> node type.
	 * @return <b>ResourcePerspective</b>
	 */
	ResourcePerspective getResourcePerspective(Node node);
}
