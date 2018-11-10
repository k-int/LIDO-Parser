package app.java.parser.dao.element.leaf.object;

import app.java.parser.model.element.leaf.object.Object;
import org.w3c.dom.Node;

public interface ObjectDAO {
	/**
	 *
	 * @param node <b>lido:object</b> node type.
	 * @return <b>Object</b>
	 */
	Object getObject(Node node);
}
