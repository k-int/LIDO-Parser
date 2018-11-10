package app.java.parser.dao.element.leaf.event;

import app.java.parser.model.element.leaf.event.EventMethod;
import org.w3c.dom.Node;

public interface EventMethodDAO {
	/**
	 *
	 * @param node <b>lido:eventMethod</b> node type.
	 * @return <b>EventMethod</b>
	 */
	EventMethod getEventMethod(Node node);
}
