package app.java.parser.dao.element.leaf.event;

import app.java.parser.model.element.leaf.event.EventDate;
import org.w3c.dom.Node;

public interface EventDateDAO {
	/**
	 *
	 * @param node <b>lido:eventDate</b> node type.
	 * @return <b>EventDate</b>
	 */
	EventDate getDisplayEvent(Node node);
}
