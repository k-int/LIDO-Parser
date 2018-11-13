package ro.webdata.lido.parser.parser.dao.element.leaf.rights;

import ro.webdata.lido.parser.parser.model.element.leaf.rights.RightsHolder;
import org.w3c.dom.Node;

public interface RightsHolderDAO {
	/**
	 *
	 * @param node <b>lido:rightsHolder</b> node type.
	 * @return <b>RightsHolder</b>
	 */
	RightsHolder getRightsHolder(Node node);
}
