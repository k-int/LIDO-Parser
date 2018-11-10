package app.java.parser.dao.element.leaf;

import app.java.parser.model.element.leaf.ConceptID;
import org.w3c.dom.Node;

public interface ConceptIDDAO {
	/**
	 *
	 * @param node <b>lido:conceptID</b> node type.
	 * @return <b>ConceptID</b>
	 */
	ConceptID getConceptID(Node node);
}
