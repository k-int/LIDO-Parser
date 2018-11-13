package ro.webdata.lido.parser.parser.dao.element.leaf.event;

import ro.webdata.lido.parser.parser.model.element.leaf.event.DisplayEvent;
import org.w3c.dom.Node;

public interface DisplayEventDAO {
	/**
	 *
	 * @param node <b>lido:displayEvent</b> node type.
	 * @return <b>DisplayEvent</b>
	 */
	DisplayEvent getDisplayEvent(Node node);
}
