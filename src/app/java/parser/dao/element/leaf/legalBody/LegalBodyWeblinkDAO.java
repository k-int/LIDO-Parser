package app.java.parser.dao.element.leaf.legalBody;

import app.java.parser.model.element.leaf.legalBody.LegalBodyWeblink;
import org.w3c.dom.Node;

public interface LegalBodyWeblinkDAO {
	/**
	 *
	 * @param node <b>lido:legalBodyWeblink</b> node type.
	 * @return <b>LegalBodyWeblink</b>
	 */
	LegalBodyWeblink getLegalBodyWeblink(Node node);
}
