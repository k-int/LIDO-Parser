package ro.webdata.lido.parser.parser.dao.element.leaf.rights;

import ro.webdata.lido.parser.parser.model.element.leaf.rights.RightsResource;
import org.w3c.dom.Node;

public interface RightsResourceDAO {
	/**
	 *
	 * @param node <b>lido:rightsResource</b> node type.
	 * @return <b>RightsResource</b>
	 */
	RightsResource getRightsResource(Node node);
}
