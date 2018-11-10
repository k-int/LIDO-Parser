package app.java.parser.dao.element.leaf.rights;

import app.java.parser.model.element.leaf.rights.RightsResource;
import org.w3c.dom.Node;

public interface RightsResourceDAO {
	/**
	 *
	 * @param node <b>lido:rightsResource</b> node type.
	 * @return <b>RightsResource</b>
	 */
	RightsResource getRightsResource(Node node);
}
