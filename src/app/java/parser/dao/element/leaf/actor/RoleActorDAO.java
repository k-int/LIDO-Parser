package app.java.parser.dao.element.leaf.actor;

import app.java.parser.model.element.leaf.actor.RoleActor;
import org.w3c.dom.Node;

public interface RoleActorDAO {
	/**
	 *
	 * @param node <b>lido:roleActor</b> node type.
	 * @return <b>RoleActor</b>
	 */
	RoleActor getRoleActor(Node node);
}
