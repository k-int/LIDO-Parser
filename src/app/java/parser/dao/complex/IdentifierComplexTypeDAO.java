package app.java.parser.dao.complex;

import app.java.parser.model.complex.IdentifierComplexType;
import org.w3c.dom.Node;

public interface IdentifierComplexTypeDAO {
	/**
	 *
	 * @param node <b>lido:identifierComplexType</b> node type.
	 * @return <b>IdentifierComplexType</b>
	 */
	IdentifierComplexType getIdentifierComplexType(Node node);
}
