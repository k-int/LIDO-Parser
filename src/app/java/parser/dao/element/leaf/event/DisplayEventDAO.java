package app.java.parser.dao.element.leaf.event;

import app.java.parser.model.element.leaf.event.DisplayEvent;
import org.w3c.dom.Node;

public interface DisplayEventDAO {
	/**
	 *
	 * @param node <b>lido:displayEvent</b> node type.
	 * @return <b>DisplayEvent</b>
	 */
	DisplayEvent getDisplayEvent(Node node);
}
