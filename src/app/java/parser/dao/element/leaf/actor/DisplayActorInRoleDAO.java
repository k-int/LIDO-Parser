package app.java.parser.dao.element.leaf.actor;

import app.java.parser.model.element.leaf.actor.DisplayActorInRole;
import org.w3c.dom.Node;

public interface DisplayActorInRoleDAO {
	/**
	 *
	 * @param node <b>lido:displayActorInRole</b> node type.
	 * @return <b>DisplayActorInRole</b>
	 */
	DisplayActorInRole getDisplayActorInRole(Node node);
}
