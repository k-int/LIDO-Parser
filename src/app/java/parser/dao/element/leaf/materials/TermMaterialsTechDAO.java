package app.java.parser.dao.element.leaf.materials;

import app.java.parser.model.element.leaf.materials.TermMaterialsTech;
import org.w3c.dom.Node;

public interface TermMaterialsTechDAO {
	/**
	 *
	 * @param node <b>lido:termMaterialsTech</b> node type.
	 * @return <b>TermMaterialsTech</b>
	 */
	TermMaterialsTech getTermMaterialsTech(Node node);
}
