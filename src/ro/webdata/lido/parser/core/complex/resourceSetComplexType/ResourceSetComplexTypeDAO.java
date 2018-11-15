package ro.webdata.lido.parser.core.complex.resourceSetComplexType;

import org.w3c.dom.Node;

public interface ResourceSetComplexTypeDAO {
	/**
	 *
	 * @param node <b>lido:resourceSetComplexType</b> node type.
	 * @return <b>ResourceSetComplexType</b>
	 */
	ResourceSetComplexType getResourceSetComplexType(Node node);
}
