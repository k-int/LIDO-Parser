package ro.webdata.lido.parser.parser.dao.element.leaf.date;

import ro.webdata.lido.parser.parser.model.element.leaf.date.DisplayDate;
import org.w3c.dom.Node;

public interface DisplayDateDAO {
	/**
	 *
	 * @param node <b>lido:displayDate</b> node types.
	 * @return <b>DisplayDate</b>
	 */
	DisplayDate getDisplayDate(Node node);
}
