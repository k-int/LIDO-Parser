package app.java.parser.dao.element.leaf.event;

import app.java.parser.model.element.leaf.event.EventName;
import org.w3c.dom.Node;

public interface EventNameDAO {
	/**
	 *
	 * @param node <b>lido:eventName</b> node type.
	 * @return <b>EventName</b>
	 */
	EventName getEventName(Node node);
}
