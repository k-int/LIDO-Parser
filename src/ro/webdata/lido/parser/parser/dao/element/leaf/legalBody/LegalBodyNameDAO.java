package ro.webdata.lido.parser.parser.dao.element.leaf.legalBody;

import ro.webdata.lido.parser.parser.model.element.leaf.legalBody.LegalBodyName;
import org.w3c.dom.Node;

public interface LegalBodyNameDAO {
	/**
	 *
	 * @param node <b>lido:legalBodyName</b> node type.
	 * @return <b>LegalBodyName</b>
	 */
	LegalBodyName getLegalBodyName(Node node);
}
