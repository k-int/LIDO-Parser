package app.java.parser.dao.complex.materials;

import app.java.parser.model.complex.materials.MaterialsTechComplexType;
import org.w3c.dom.Node;

public interface MaterialsTechComplexTypeDAO {
	/**
	 *
	 * @param node <b>lido:materialsTechComplexType</b> node type.
	 * @return <b>MaterialsTechComplexType</b>
	 */
	MaterialsTechComplexType getMaterialsTechComplexType(Node node);
}
