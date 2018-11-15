package ro.webdata.lido.parser.core.leaf.eventMethod;

import org.w3c.dom.Node;

public interface EventMethodDAO {
	/**
	 *
	 * @param node <b>lido:eventMethod</b> node type.
	 * @return <b>EventMethod</b>
	 */
	EventMethod getEventMethod(Node node);
}
