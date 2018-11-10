package app.java.parser.dao.complex.actor;

import app.java.parser.model.complex.actor.ActorComplexType;
import org.w3c.dom.Node;

public interface ActorComplexTypeDAO {
	/**
	 *
	 * @param node <b>lido:actorComplexType</b> node type.
	 * @return <b>ActorComplexType</b>
	 */
	ActorComplexType getActorComplexType(Node node);
}
