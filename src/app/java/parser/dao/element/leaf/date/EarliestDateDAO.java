package app.java.parser.dao.element.leaf.date;

import app.java.parser.model.element.leaf.date.EarliestDate;
import org.w3c.dom.Node;

public interface EarliestDateDAO {
	/**
	 *
	 * @param node <b>lido:earliestDate</b> node type.
	 * @return <b>EarliestDate</b>
	 */
	EarliestDate getEarliestDate(Node node);
}
