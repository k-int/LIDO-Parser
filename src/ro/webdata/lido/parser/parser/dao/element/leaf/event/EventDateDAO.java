package ro.webdata.lido.parser.parser.dao.element.leaf.event;

import ro.webdata.lido.parser.parser.model.element.leaf.event.EventDate;
import org.w3c.dom.Node;

public interface EventDateDAO {
	/**
	 *
	 * @param node <b>lido:eventDate</b> node type.
	 * @return <b>EventDate</b>
	 */
	EventDate getDisplayEvent(Node node);
}
