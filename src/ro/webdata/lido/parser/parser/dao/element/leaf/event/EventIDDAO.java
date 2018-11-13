package ro.webdata.lido.parser.parser.dao.element.leaf.event;

import ro.webdata.lido.parser.parser.model.element.leaf.event.EventID;
import org.w3c.dom.Node;

public interface EventIDDAO {
	/**
	 *
	 * @param node <b>lido:eventID</b> node type.
	 * @return <b>EventID</b>
	 */
	EventID getEventID(Node node);
}
