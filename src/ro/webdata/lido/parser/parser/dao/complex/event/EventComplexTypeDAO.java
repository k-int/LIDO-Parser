package ro.webdata.lido.parser.parser.dao.complex.event;

import ro.webdata.lido.parser.parser.model.complex.event.EventComplexType;
import org.w3c.dom.Node;

public interface EventComplexTypeDAO {
	/**
	 *
	 * @param node <b>lido:eventComplexType</b> node type.
	 * @return <b>EventComplexType</b>
	 */
	EventComplexType getEventComplexType(Node node);
}
