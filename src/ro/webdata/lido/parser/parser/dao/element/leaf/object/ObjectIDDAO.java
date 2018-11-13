package ro.webdata.lido.parser.parser.dao.element.leaf.object;

import ro.webdata.lido.parser.parser.model.element.leaf.object.ObjectID;
import org.w3c.dom.Node;

public interface ObjectIDDAO {
	/**
	 *
	 * @param node <b>lido:objectID</b> node type.
	 * @return <b>ObjectID</b>
	 */
	ObjectID getObjectID(Node node);
}
