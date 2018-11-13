package ro.webdata.lido.parser.parser.dao.element.leaf.actor;

import ro.webdata.lido.parser.parser.model.element.leaf.actor.DisplayActorInRole;
import org.w3c.dom.Node;

public interface DisplayActorInRoleDAO {
	/**
	 *
	 * @param node <b>lido:displayActorInRole</b> node type.
	 * @return <b>DisplayActorInRole</b>
	 */
	DisplayActorInRole getDisplayActorInRole(Node node);
}
