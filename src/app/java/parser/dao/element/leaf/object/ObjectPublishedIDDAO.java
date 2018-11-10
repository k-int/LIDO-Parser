package app.java.parser.dao.element.leaf.object;

import app.java.parser.model.element.leaf.object.ObjectPublishedID;
import org.w3c.dom.Node;

public interface ObjectPublishedIDDAO {
	/**
	 *
	 * @param node <b>lido:objectPublishedID</b> node type.
	 * @return <b>ObjectPublishedID</b>
	 */
	ObjectPublishedID getObjectPublishedID(Node node);
}
