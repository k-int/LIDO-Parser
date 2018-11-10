package app.java.parser.dao.complex.event;

import app.java.parser.model.complex.event.EventComplexType;
import org.w3c.dom.Node;

public interface EventComplexTypeDAO {
	/**
	 *
	 * @param node <b>lido:eventComplexType</b> node type.
	 * @return <b>EventComplexType</b>
	 */
	EventComplexType getEventComplexType(Node node);
}
