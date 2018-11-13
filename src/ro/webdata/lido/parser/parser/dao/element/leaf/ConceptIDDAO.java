package ro.webdata.lido.parser.parser.dao.element.leaf;

import ro.webdata.lido.parser.parser.model.element.leaf.ConceptID;
import org.w3c.dom.Node;

public interface ConceptIDDAO {
	/**
	 *
	 * @param node <b>lido:conceptID</b> node type.
	 * @return <b>ConceptID</b>
	 */
	ConceptID getConceptID(Node node);
}
