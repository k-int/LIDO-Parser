package ro.webdata.lido.parser.parser.dao.element.leaf.resource;

import ro.webdata.lido.parser.parser.model.element.leaf.resource.ResourceRepresentation;
import org.w3c.dom.Node;

public interface ResourceRepresentationDAO {
	/**
	 *
	 * @param node <b>lido:resourceRepresentation</b> node type.
	 * @return <b>ResourceRepresentation</b>
	 */
	ResourceRepresentation getResourceRepresentation(Node node);
}
