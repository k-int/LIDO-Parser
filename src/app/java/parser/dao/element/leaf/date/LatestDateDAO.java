package app.java.parser.dao.element.leaf.date;

import app.java.parser.model.element.leaf.date.LatestDate;
import org.w3c.dom.Node;

public interface LatestDateDAO {
	/**
	 *
	 * @param node <b>lido:latestDate</b> node type.
	 * @return <b>LatestDate</b>
	 */
	LatestDate getLatestDate(Node node);
}
