package app.java.parser.dao.element.leaf.legalBody;

import app.java.parser.model.element.leaf.legalBody.LegalBodyID;
import org.w3c.dom.Node;

public interface LegalBodyIDDAO {
	/**
	 *
	 * @param node <b>lido:legalBodyID</b> node type.
	 * @return <b>LegalBodyID</b>
	 */
	LegalBodyID getLegalBodyID(Node node);
}
