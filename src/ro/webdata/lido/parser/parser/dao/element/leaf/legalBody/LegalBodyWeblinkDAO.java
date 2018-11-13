package ro.webdata.lido.parser.parser.dao.element.leaf.legalBody;

import ro.webdata.lido.parser.parser.model.element.leaf.legalBody.LegalBodyWeblink;
import org.w3c.dom.Node;

public interface LegalBodyWeblinkDAO {
	/**
	 *
	 * @param node <b>lido:legalBodyWeblink</b> node type.
	 * @return <b>LegalBodyWeblink</b>
	 */
	LegalBodyWeblink getLegalBodyWeblink(Node node);
}
