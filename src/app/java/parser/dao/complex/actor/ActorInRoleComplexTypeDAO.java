package app.java.parser.dao.complex.actor;

import app.java.parser.model.complex.actor.ActorInRoleComplexType;
import org.w3c.dom.Node;

public interface ActorInRoleComplexTypeDAO {
	/**
	 *
	 * @param node <b>lido:actorInRoleComplexType</b> node type.
	 * @return <b>ActorInRoleComplexType</b>
	 */
	ActorInRoleComplexType getActorInRoleComplexType(Node node);
}
