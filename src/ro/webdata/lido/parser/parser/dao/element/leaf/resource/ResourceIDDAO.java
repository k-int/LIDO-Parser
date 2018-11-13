package ro.webdata.lido.parser.parser.dao.element.leaf.resource;

import ro.webdata.lido.parser.parser.model.element.leaf.resource.ResourceID;
import org.w3c.dom.Node;

public interface ResourceIDDAO {
	/**
	 *
	 * @param node <b>lido:resourceID</b> node type.
	 * @return <b>ResourceID</b>
	 */
	ResourceID getResourceID(Node node);
}
