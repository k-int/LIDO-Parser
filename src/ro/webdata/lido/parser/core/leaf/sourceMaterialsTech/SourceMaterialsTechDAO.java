package ro.webdata.lido.parser.core.leaf.sourceMaterialsTech;

import org.w3c.dom.Node;

public interface SourceMaterialsTechDAO {
	/**
	 *
	 * @param node <b>lido:sourceMaterialsTech</b> node type.
	 * @return <b>SourceMaterialsTech</b>
	 */
	SourceMaterialsTech getSourceMaterialsTech(Node node);
}
