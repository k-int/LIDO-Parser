package ro.webdata.lido.parser.parser.dao.element.leaf.materials;

import ro.webdata.lido.parser.parser.model.element.leaf.materials.MaterialsTech;
import org.w3c.dom.Node;

public interface MaterialsTechDAO {
	/**
	 *
	 * @param node <b>lido:displayMaterialsTech</b> node type.
	 * @return <b>MaterialsTech</b>
	 */
	MaterialsTech getMaterialsTech(Node node);
}
