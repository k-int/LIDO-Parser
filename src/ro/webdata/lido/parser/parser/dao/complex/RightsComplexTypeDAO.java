package ro.webdata.lido.parser.parser.dao.complex;

import ro.webdata.lido.parser.parser.model.complex.RightsComplexType;
import org.w3c.dom.Node;

public interface RightsComplexTypeDAO {
	/**
	 *
	 * @param node <b>lido:rightsComplexType</b> node type.
	 * @return <b>RightsComplexType</b>
	 */
	RightsComplexType getRightsComplexType(Node node);
}
