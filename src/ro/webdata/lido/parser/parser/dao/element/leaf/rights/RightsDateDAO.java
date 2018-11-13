package ro.webdata.lido.parser.parser.dao.element.leaf.rights;

import ro.webdata.lido.parser.parser.model.element.leaf.rights.RightsDate;
import org.w3c.dom.Node;

public interface RightsDateDAO {
	/**
	 *
	 * @param node <b>lido:rightsDate</b> node type.
	 * @return <b>RightsDate</b>
	 */
	RightsDate getRightsDate(Node node);
}
