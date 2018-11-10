package app.java.parser.dao.complex;

import app.java.parser.model.complex.ConceptComplexType;
import org.w3c.dom.Node;

public interface ConceptComplexTypeDAO {
	/**
	 *
	 * @param node <b>lido:conceptComplexType</b> node type.
	 * @return <b>ConceptComplexType</b>
	 */
	ConceptComplexType getConceptComplexType(Node node);
}
