package ro.webdata.lido.parser.parser.dao.element.leaf.event;

import ro.webdata.lido.parser.parser.model.element.leaf.event.EventName;
import org.w3c.dom.Node;

public interface EventNameDAO {
	/**
	 *
	 * @param node <b>lido:eventName</b> node type.
	 * @return <b>EventName</b>
	 */
	EventName getEventName(Node node);
}
