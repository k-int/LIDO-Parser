package app.java.parser.dao.element.leaf.actor;

import app.java.parser.model.element.leaf.actor.Actor;
import org.w3c.dom.Node;

public interface ActorDAO {
	/**
	 *
	 * @param node <b>lido:actor</b> node type.
	 * @return <b>Actor</b>
	 */
	Actor getActor(Node node);
}
