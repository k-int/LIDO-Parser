package app.java.parser.dao.element.leaf.event;

import app.java.parser.model.element.leaf.event.RoleInEvent;
import org.w3c.dom.Node;

public interface RoleInEventDAO {
	/**
	 *
	 * @param node <b>lido:roleInEvent</b> node type.
	 * @return <b>RoleInEvent</b>
	 */
	RoleInEvent getRoleInEvent(Node node);
}
