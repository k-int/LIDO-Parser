package app.java.parser.dao.element.leaf.rights;

import app.java.parser.model.element.leaf.rights.RightsDate;
import org.w3c.dom.Node;

public interface RightsDateDAO {
	/**
	 *
	 * @param node <b>lido:rightsDate</b> node type.
	 * @return <b>RightsDate</b>
	 */
	RightsDate getRightsDate(Node node);
}
