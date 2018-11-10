package app.java.parser.dao.element.leaf.event;

import app.java.parser.model.element.leaf.event.Event;
import org.w3c.dom.Node;

public interface EventDAO {
	/**
	 *
	 * @param node <b>lido:event</b> node type.
	 * @return <b>Event</b>
	 */
	Event getDisplayEvent(Node node);
}
