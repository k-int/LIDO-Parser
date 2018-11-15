package ro.webdata.lido.parser.core.leaf.eventID;

import org.w3c.dom.Node;

public interface EventIDDAO {
	/**
	 *
	 * @param node <b>lido:eventID</b> node type.
	 * @return <b>EventID</b>
	 */
	EventID getEventID(Node node);
}
