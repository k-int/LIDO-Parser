package ro.webdata.lido.parser.parser.dao.element.leaf.actor;

import ro.webdata.lido.parser.parser.model.element.leaf.actor.ActorInRole;
import org.w3c.dom.Node;

public interface ActorInRoleDAO {
	/**
	 *
	 * @param node <b>lido:actorInRole</b> node type.
	 * @return <b>ActorInRole</b>
	 */
	ActorInRole getActorInRole(Node node);
}
