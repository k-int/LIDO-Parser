package ro.webdata.lido.parser.parser.dao.complex;

import ro.webdata.lido.parser.parser.model.complex.ResourceSetComplexType;
import org.w3c.dom.Node;

public interface ResourceSetComplexTypeDAO {
	/**
	 *
	 * @param node <b>lido:resourceSetComplexType</b> node type.
	 * @return <b>ResourceSetComplexType</b>
	 */
	ResourceSetComplexType getResourceSetComplexType(Node node);
}
