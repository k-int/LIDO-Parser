package ro.webdata.lido.parser.parser.dao.complex;

import ro.webdata.lido.parser.parser.model.complex.IdentifierComplexType;
import org.w3c.dom.Node;

public interface IdentifierComplexTypeDAO {
	/**
	 *
	 * @param node <b>lido:identifierComplexType</b> node type.
	 * @return <b>IdentifierComplexType</b>
	 */
	IdentifierComplexType getIdentifierComplexType(Node node);
}
