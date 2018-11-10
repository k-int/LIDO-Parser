package app.java.parser.dao.element.leaf.date;

import app.java.parser.model.element.leaf.date.Date;
import org.w3c.dom.Node;

public interface DateDAO {
	/**
	 *
	 * @param node <b>lido:date</b> node type.
	 * @return <b>Date</b>
	 */
	Date getDate(Node node);
}
