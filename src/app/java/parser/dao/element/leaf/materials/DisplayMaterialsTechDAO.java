package app.java.parser.dao.element.leaf.materials;

import app.java.parser.model.element.leaf.materials.DisplayMaterialsTech;
import org.w3c.dom.Node;

public interface DisplayMaterialsTechDAO {
	/**
	 *
	 * @param node <b>lido:displayMaterialsTech</b> node type.
	 * @return <b>DisplayMaterialsTech</b>
	 */
	DisplayMaterialsTech getDisplayMaterialsTech(Node node);
}
