package ro.webdata.lido.parser.parser.dao.complex.materials;

import ro.webdata.lido.parser.parser.model.complex.materials.MaterialsTechSetComplexType;
import org.w3c.dom.Node;

public interface MaterialsTechSetComplexTypeDAO {
	/**
	 *
	 * @param node <b>lido:materialsTechSetComplexType</b> node type.
	 * @return <b>MaterialsTechSetComplexType</b>
	 */
	MaterialsTechSetComplexType getMaterialsTechSetComplexType(Node node);
}
