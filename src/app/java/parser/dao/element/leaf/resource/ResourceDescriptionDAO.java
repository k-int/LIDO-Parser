package app.java.parser.dao.element.leaf.resource;

import app.java.parser.model.element.leaf.resource.ResourceDescription;
import org.w3c.dom.Node;

public interface ResourceDescriptionDAO {
	/**
	 *
	 * @param node <b>lido:resourceDescription</b> node type.
	 * @return <b>ResourceDescription</b>
	 */
	ResourceDescription getResourceDescription(Node node);
}
