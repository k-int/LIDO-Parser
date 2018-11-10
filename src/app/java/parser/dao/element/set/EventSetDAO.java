package app.java.parser.dao.element.set;

import app.java.parser.model.element.set.EventSet;
import org.w3c.dom.Node;

public interface EventSetDAO {
	/**
	 *
	 * @param node <b>lido:eventSet</b> node type.
	 * @return <b>EventSet</b>
	 */
	EventSet getEventSet(Node node);
}
