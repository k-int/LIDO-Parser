package ro.webdata.lido.parser.core.leaf.objectPublishedID;

import org.w3c.dom.Node;

public interface ObjectPublishedIDDAO {
	/**
	 *
	 * @param node <b>lido:objectPublishedID</b> node type.
	 * @return <b>ObjectPublishedID</b>
	 */
	ObjectPublishedID getObjectPublishedID(Node node);
}
