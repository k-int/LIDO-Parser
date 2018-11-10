package app.java.parser.dao.element.leaf.materials;

import app.java.parser.model.element.leaf.materials.ExtentMaterialsTech;
import org.w3c.dom.Node;

public interface ExtentMaterialsTechDAO {
	/**
	 *
	 * @param node <b>lido:extentMaterialsTech</b> node type.
	 * @return <b>ExtentMaterialsTech</b>
	 */
	ExtentMaterialsTech getExtentMaterialsTech(Node node);
}
