package ro.webdata.lido.parser.parser.dao.element.leaf.event;

import ro.webdata.lido.parser.parser.model.element.leaf.event.EventMethod;
import org.w3c.dom.Node;

public interface EventMethodDAO {
	/**
	 *
	 * @param node <b>lido:eventMethod</b> node type.
	 * @return <b>EventMethod</b>
	 */
	EventMethod getEventMethod(Node node);
}
