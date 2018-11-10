package app.java.parser.dao.element.leaf.date;

import app.java.parser.model.element.leaf.date.DisplayDate;
import org.w3c.dom.Node;

public interface DisplayDateDAO {
	/**
	 *
	 * @param node <b>lido:displayDate</b> node types.
	 * @return <b>DisplayDate</b>
	 */
	DisplayDate getDisplayDate(Node node);
}
