package app.java.parser.dao.element.set;

import app.java.parser.model.element.set.EventDescriptionSet;
import org.w3c.dom.Node;

public interface EventDescriptionSetDAO {
	/**
	 *
	 * @param node <b>lido:eventDescriptionSet</b> node type.
	 * @return <b>EventDescriptionSet</b>
	 */
	EventDescriptionSet getEventDescriptionSet(Node node);
}
