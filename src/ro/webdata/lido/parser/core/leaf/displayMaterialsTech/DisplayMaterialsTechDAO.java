package ro.webdata.lido.parser.core.leaf.displayMaterialsTech;

import org.w3c.dom.Node;

public interface DisplayMaterialsTechDAO {
	/**
	 *
	 * @param node <b>lido:displayMaterialsTech</b> node type.
	 * @return <b>DisplayMaterialsTech</b>
	 */
	DisplayMaterialsTech getDisplayMaterialsTech(Node node);
}
