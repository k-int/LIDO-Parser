package app.java.parser.dao.complex.event;

import app.java.parser.model.complex.event.EventSetComplexType;
import org.w3c.dom.Node;

public interface EventSetComplexTypeDAO {
	/**
	 *
	 * @param node <b>lido:eventSetComplexType</b> node type.
	 * @return <b>EventSetComplexType</b>
	 */
	EventSetComplexType getEventSetComplexType(Node node);
}
