package app.java.parser.dao.element.leaf.object;

import app.java.parser.model.element.leaf.object.ObjectID;
import org.w3c.dom.Node;

public interface ObjectIDDAO {
	/**
	 *
	 * @param node <b>lido:objectID</b> node type.
	 * @return <b>ObjectID</b>
	 */
	ObjectID getObjectID(Node node);
}
