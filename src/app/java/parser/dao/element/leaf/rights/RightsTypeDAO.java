package app.java.parser.dao.element.leaf.rights;

import app.java.parser.model.element.leaf.rights.RightsType;
import org.w3c.dom.Node;

public interface RightsTypeDAO {
	/**
	 *
	 * @param node <b>lido:rightsType</b> node type.
	 * @return <b>RightsType</b>
	 */
	RightsType getRightsType(Node node);
}
