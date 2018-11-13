package ro.webdata.lido.parser.parser.dao.element.leaf.resource;

import ro.webdata.lido.parser.parser.model.element.leaf.resource.ResourceDateTaken;
import org.w3c.dom.Node;

public interface ResourceDateTakenDAO {
	/**
	 *
	 * @param node <b>lido:resourceDateTaken</b> node type.
	 * @return <b>ResourceDateTaken</b>
	 */
	ResourceDateTaken getDateSetComplexType(Node node);
}
