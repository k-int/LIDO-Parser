package ro.webdata.lido.parser.parser.dao.element.leaf.event;

import ro.webdata.lido.parser.parser.model.element.leaf.event.RoleInEvent;
import org.w3c.dom.Node;

public interface RoleInEventDAO {
	/**
	 *
	 * @param node <b>lido:roleInEvent</b> node type.
	 * @return <b>RoleInEvent</b>
	 */
	RoleInEvent getRoleInEvent(Node node);
}
