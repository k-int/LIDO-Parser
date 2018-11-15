package ro.webdata.lido.parser.core.leaf.actorInRole;

import org.w3c.dom.Node;

public interface ActorInRoleDAO {
	/**
	 *
	 * @param node <b>lido:actorInRole</b> node type.
	 * @return <b>ActorInRole</b>
	 */
	ActorInRole getActorInRole(Node node);
}
