package app.java.parser.dao.element.leaf;

import app.java.parser.model.element.leaf.gml.Gml;
import org.w3c.dom.Node;

public interface GmlDAO {
	/**
	 *
	 * @param node <b>lido:gml</b> node type.
	 * @return <b>Gml</b>
	 */
	Gml getGml(Node node);
}
