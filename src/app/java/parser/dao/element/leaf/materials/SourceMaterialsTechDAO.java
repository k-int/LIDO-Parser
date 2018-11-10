package app.java.parser.dao.element.leaf.materials;

import app.java.parser.model.element.leaf.materials.SourceMaterialsTech;
import org.w3c.dom.Node;

public interface SourceMaterialsTechDAO {
	/**
	 *
	 * @param node <b>lido:sourceMaterialsTech</b> node type.
	 * @return <b>SourceMaterialsTech</b>
	 */
	SourceMaterialsTech getSourceMaterialsTech(Node node);
}
