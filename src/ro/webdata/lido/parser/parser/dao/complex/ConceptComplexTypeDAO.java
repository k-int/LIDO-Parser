package ro.webdata.lido.parser.parser.dao.complex;

import ro.webdata.lido.parser.parser.model.complex.ConceptComplexType;
import org.w3c.dom.Node;

public interface ConceptComplexTypeDAO {
	/**
	 *
	 * @param node <b>lido:conceptComplexType</b> node type.
	 * @return <b>ConceptComplexType</b>
	 */
	ConceptComplexType getConceptComplexType(Node node);
}
