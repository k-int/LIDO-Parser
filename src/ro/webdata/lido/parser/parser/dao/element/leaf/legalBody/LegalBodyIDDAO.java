package ro.webdata.lido.parser.parser.dao.element.leaf.legalBody;

import ro.webdata.lido.parser.parser.model.element.leaf.legalBody.LegalBodyID;
import org.w3c.dom.Node;

public interface LegalBodyIDDAO {
	/**
	 *
	 * @param node <b>lido:legalBodyID</b> node type.
	 * @return <b>LegalBodyID</b>
	 */
	LegalBodyID getLegalBodyID(Node node);
}
