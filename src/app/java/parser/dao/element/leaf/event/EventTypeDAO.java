package app.java.parser.dao.element.leaf.event;

import app.java.parser.model.element.leaf.event.EventType;
import org.w3c.dom.Node;

public interface EventTypeDAO {
	/**
	 *
	 * @param node <b>lido:eventType</b> node type.
	 * @return <b>EventType</b>
	 */
	EventType getEventType(Node node);
}
