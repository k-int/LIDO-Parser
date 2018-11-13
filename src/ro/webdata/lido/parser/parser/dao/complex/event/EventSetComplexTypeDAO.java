package ro.webdata.lido.parser.parser.dao.complex.event;

import ro.webdata.lido.parser.parser.model.complex.event.EventSetComplexType;
import org.w3c.dom.Node;

public interface EventSetComplexTypeDAO {
	/**
	 *
	 * @param node <b>lido:eventSetComplexType</b> node type.
	 * @return <b>EventSetComplexType</b>
	 */
	EventSetComplexType getEventSetComplexType(Node node);
}
