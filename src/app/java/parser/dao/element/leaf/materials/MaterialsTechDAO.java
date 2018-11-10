package app.java.parser.dao.element.leaf.materials;

import app.java.parser.model.element.leaf.materials.MaterialsTech;
import org.w3c.dom.Node;

public interface MaterialsTechDAO {
	/**
	 *
	 * @param node <b>lido:displayMaterialsTech</b> node type.
	 * @return <b>MaterialsTech</b>
	 */
	MaterialsTech getMaterialsTech(Node node);
}
