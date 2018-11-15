package ro.webdata.lido.parser.core.leaf.resourceID;

import org.w3c.dom.Node;

public interface ResourceIDDAO {
	/**
	 *
	 * @param node <b>lido:resourceID</b> node type.
	 * @return <b>ResourceID</b>
	 */
	ResourceID getResourceID(Node node);
}
