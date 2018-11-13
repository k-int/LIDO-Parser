package ro.webdata.lido.parser.parser.dao.element.leaf.event;

import ro.webdata.lido.parser.parser.model.element.leaf.event.EventActor;
import org.w3c.dom.Node;

public interface EventActorDAO {
	/**
	 *
	 * @param node <b>lido:nationalityActor</b> node type.
	 * @return <b>EventActor</b>
	 */
	EventActor getEventActor(Node node);
}
