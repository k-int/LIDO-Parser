package ro.webdata.lido.parser.parser.dao.element.leaf.resource;

import ro.webdata.lido.parser.parser.model.element.leaf.resource.ResourceRelType;
import org.w3c.dom.Node;

public interface ResourceRelTypeDAO {
	/**
	 *
	 * @param node <b>lido:resourceRelType</b> node type.
	 * @return <b>ResourceRelType</b>
	 */
	ResourceRelType getResourceRelType(Node node);
}
