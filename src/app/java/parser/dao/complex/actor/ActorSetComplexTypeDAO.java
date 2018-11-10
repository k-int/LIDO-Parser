package app.java.parser.dao.complex.actor;

import app.java.parser.model.complex.actor.ActorSetComplexType;
import org.w3c.dom.Node;

public interface ActorSetComplexTypeDAO {
	/**
	 *
	 * @param node <b>lido:actorSetComplexType</b> node type.
	 * @return <b>ActorSetComplexType</b>
	 */
	ActorSetComplexType getActorSetComplexType(Node node);
}
