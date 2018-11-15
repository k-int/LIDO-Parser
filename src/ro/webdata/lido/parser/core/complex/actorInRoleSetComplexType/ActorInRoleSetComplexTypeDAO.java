package ro.webdata.lido.parser.core.complex.actorInRoleSetComplexType;

import org.w3c.dom.Node;

public interface ActorInRoleSetComplexTypeDAO {
	/**
	 *
	 * @param node <b>lido:actorInRoleSetComplexType</b> node type.
	 * @return <b>ActorInRoleSetComplexType</b>
	 */
	ActorInRoleSetComplexType getActorInRoleSetComplexType(Node node);
}
