package ro.webdata.lido.parser.parser.dao.element.leaf;

import ro.webdata.lido.parser.parser.model.element.leaf.gml.Gml;
import org.w3c.dom.Node;

public interface GmlDAO {
	/**
	 *
	 * @param node <b>lido:gml</b> node type.
	 * @return <b>Gml</b>
	 */
	Gml getGml(Node node);
}
