package app.java.parser.dao.element.leaf.object;

import app.java.parser.model.element.leaf.object.DisplayObject;
import org.w3c.dom.Node;

public interface DisplayObjectDAO {
	/**
	 *
	 * @param node <b>lido:displayObject</b> node type.
	 * @return <b>DisplayObject</b>
	 */
	DisplayObject getDisplayObject(Node node);
}
