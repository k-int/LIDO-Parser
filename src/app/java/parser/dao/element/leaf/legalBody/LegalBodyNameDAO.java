package app.java.parser.dao.element.leaf.legalBody;

import app.java.parser.model.element.leaf.legalBody.LegalBodyName;
import org.w3c.dom.Node;

public interface LegalBodyNameDAO {
	/**
	 *
	 * @param node <b>lido:legalBodyName</b> node type.
	 * @return <b>LegalBodyName</b>
	 */
	LegalBodyName getLegalBodyName(Node node);
}
