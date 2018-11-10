package app.java.parser.dao.element.set;

import app.java.parser.model.element.set.RightsWorkSet;
import org.w3c.dom.Node;

public interface RightsWorkSetDAO {
	/**
	 *
	 * @param node <b>lido:rightsWorkSet</b> node type.
	 * @return <b>RightsWorkSet</b>
	 */
	RightsWorkSet getRightsWorkSet(Node node);
}
