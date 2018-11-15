package ro.webdata.lido.parser.core.leaf.event;

import org.w3c.dom.Node;

public interface EventDAO {
	/**
	 *
	 * @param node <b>lido:event</b> node type.
	 * @return <b>Event</b>
	 */
	Event getDisplayEvent(Node node);
}
