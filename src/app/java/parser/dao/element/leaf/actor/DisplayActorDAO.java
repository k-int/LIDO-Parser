package app.java.parser.dao.element.leaf.actor;

import app.java.parser.model.element.leaf.actor.DisplayActor;
import org.w3c.dom.Node;

public interface DisplayActorDAO {
	/**
	 *
	 * @param node <b>lido:displayActor</b> node type.
	 * @return <b>DisplayActor</b>
	 */
	DisplayActor getDisplayActor(Node node);
}
