package app.java.parser.dao.element.leaf.actor;

import app.java.parser.model.element.leaf.actor.ActorInRole;
import org.w3c.dom.Node;

public interface ActorInRoleDAO {
	/**
	 *
	 * @param node <b>lido:actorInRole</b> node type.
	 * @return <b>ActorInRole</b>
	 */
	ActorInRole getActorInRole(Node node);
}
