package ro.webdata.lido.parser.parser.dao.element.set;

import ro.webdata.lido.parser.parser.model.element.set.EventSet;
import org.w3c.dom.Node;

public interface EventSetDAO {
	/**
	 *
	 * @param node <b>lido:eventSet</b> node type.
	 * @return <b>EventSet</b>
	 */
	EventSet getEventSet(Node node);
}
