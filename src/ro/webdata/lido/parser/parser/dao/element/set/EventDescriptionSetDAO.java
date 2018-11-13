package ro.webdata.lido.parser.parser.dao.element.set;

import ro.webdata.lido.parser.parser.model.element.set.EventDescriptionSet;
import org.w3c.dom.Node;

public interface EventDescriptionSetDAO {
	/**
	 *
	 * @param node <b>lido:eventDescriptionSet</b> node type.
	 * @return <b>EventDescriptionSet</b>
	 */
	EventDescriptionSet getEventDescriptionSet(Node node);
}
