package ro.webdata.lido.parser.core.complex.actorComplexType;

import org.w3c.dom.Node;

public interface ActorComplexTypeDAO {
	/**
	 *
	 * @param node <b>lido:actorComplexType</b> node type.
	 * @return <b>ActorComplexType</b>
	 */
	ActorComplexType getActorComplexType(Node node);
}
