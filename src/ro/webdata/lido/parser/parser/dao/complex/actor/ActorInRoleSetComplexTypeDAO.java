package ro.webdata.lido.parser.parser.dao.complex.actor;

import ro.webdata.lido.parser.parser.model.complex.actor.ActorInRoleSetComplexType;
import org.w3c.dom.Node;

public interface ActorInRoleSetComplexTypeDAO {
	/**
	 *
	 * @param node <b>lido:actorInRoleSetComplexType</b> node type.
	 * @return <b>ActorInRoleSetComplexType</b>
	 */
	ActorInRoleSetComplexType getActorInRoleSetComplexType(Node node);
}
