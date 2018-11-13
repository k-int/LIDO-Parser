package ro.webdata.lido.parser.parser.dao.element.leaf.actor;

import ro.webdata.lido.parser.parser.model.element.leaf.actor.RoleActor;
import org.w3c.dom.Node;

public interface RoleActorDAO {
	/**
	 *
	 * @param node <b>lido:roleActor</b> node type.
	 * @return <b>RoleActor</b>
	 */
	RoleActor getRoleActor(Node node);
}
