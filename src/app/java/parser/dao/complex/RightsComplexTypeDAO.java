package app.java.parser.dao.complex;

import app.java.parser.model.complex.RightsComplexType;
import org.w3c.dom.Node;

public interface RightsComplexTypeDAO {
	/**
	 *
	 * @param node <b>lido:rightsComplexType</b> node type.
	 * @return <b>RightsComplexType</b>
	 */
	RightsComplexType getRightsComplexType(Node node);
}
