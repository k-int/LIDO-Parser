package ro.webdata.lido.parser.parser.dao.element.leaf.actor;

import ro.webdata.lido.parser.parser.model.element.leaf.actor.ActorID;
import org.w3c.dom.Node;

public interface ActorIDDAO {
	/**
	 *
	 * @param node <b>lido:actorID</b> node type.
	 * @return <b>ActorID</b>
	 */
	ActorID getActorID(Node node);
}
