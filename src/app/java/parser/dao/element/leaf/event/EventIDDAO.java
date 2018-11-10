package app.java.parser.dao.element.leaf.event;

import app.java.parser.model.element.leaf.event.EventID;
import org.w3c.dom.Node;

public interface EventIDDAO {
	/**
	 *
	 * @param node <b>lido:eventID</b> node type.
	 * @return <b>EventID</b>
	 */
	EventID getEventID(Node node);
}
