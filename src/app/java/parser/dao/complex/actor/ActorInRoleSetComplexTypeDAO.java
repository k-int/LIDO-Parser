package app.java.parser.dao.complex.actor;

import app.java.parser.model.complex.actor.ActorInRoleSetComplexType;
import org.w3c.dom.Node;

public interface ActorInRoleSetComplexTypeDAO {
	/**
	 *
	 * @param node <b>lido:actorInRoleSetComplexType</b> node type.
	 * @return <b>ActorInRoleSetComplexType</b>
	 */
	ActorInRoleSetComplexType getActorInRoleSetComplexType(Node node);
}
