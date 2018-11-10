package app.java.parser.dao.element.leaf.resource;

import app.java.parser.model.element.leaf.resource.ResourceDateTaken;
import org.w3c.dom.Node;

public interface ResourceDateTakenDAO {
	/**
	 *
	 * @param node <b>lido:resourceDateTaken</b> node type.
	 * @return <b>ResourceDateTaken</b>
	 */
	ResourceDateTaken getDateSetComplexType(Node node);
}
