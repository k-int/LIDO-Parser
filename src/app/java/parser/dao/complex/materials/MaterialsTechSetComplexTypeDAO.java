package app.java.parser.dao.complex.materials;

import app.java.parser.model.complex.materials.MaterialsTechSetComplexType;
import org.w3c.dom.Node;

public interface MaterialsTechSetComplexTypeDAO {
	/**
	 *
	 * @param node <b>lido:materialsTechSetComplexType</b> node type.
	 * @return <b>MaterialsTechSetComplexType</b>
	 */
	MaterialsTechSetComplexType getMaterialsTechSetComplexType(Node node);
}
