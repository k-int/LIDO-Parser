package ro.webdata.lido.parser.core.leaf.resourceRepresentation;

import org.w3c.dom.Node;

public interface ResourceRepresentationDAO {
	/**
	 *
	 * @param node <b>lido:resourceRepresentation</b> node type.
	 * @return <b>ResourceRepresentation</b>
	 */
	ResourceRepresentation getResourceRepresentation(Node node);
}
