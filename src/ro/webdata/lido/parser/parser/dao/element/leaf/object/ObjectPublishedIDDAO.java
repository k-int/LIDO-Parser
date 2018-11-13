package ro.webdata.lido.parser.parser.dao.element.leaf.object;

import ro.webdata.lido.parser.parser.model.element.leaf.object.ObjectPublishedID;
import org.w3c.dom.Node;

public interface ObjectPublishedIDDAO {
	/**
	 *
	 * @param node <b>lido:objectPublishedID</b> node type.
	 * @return <b>ObjectPublishedID</b>
	 */
	ObjectPublishedID getObjectPublishedID(Node node);
}
