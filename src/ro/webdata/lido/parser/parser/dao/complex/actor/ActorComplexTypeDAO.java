package ro.webdata.lido.parser.parser.dao.complex.actor;

import ro.webdata.lido.parser.parser.model.complex.actor.ActorComplexType;
import org.w3c.dom.Node;

public interface ActorComplexTypeDAO {
	/**
	 *
	 * @param node <b>lido:actorComplexType</b> node type.
	 * @return <b>ActorComplexType</b>
	 */
	ActorComplexType getActorComplexType(Node node);
}
