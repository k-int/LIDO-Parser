package app.java.parser.dao.element.leaf.event;

import app.java.parser.model.element.leaf.event.EventActor;
import org.w3c.dom.Node;

public interface EventActorDAO {
	/**
	 *
	 * @param node <b>lido:nationalityActor</b> node type.
	 * @return <b>EventActor</b>
	 */
	EventActor getEventActor(Node node);
}
