package ro.webdata.lido.parser.parser.dao.element.leaf.date;

import ro.webdata.lido.parser.parser.model.element.leaf.date.Date;
import org.w3c.dom.Node;

public interface DateDAO {
	/**
	 *
	 * @param node <b>lido:date</b> node type.
	 * @return <b>Date</b>
	 */
	Date getDate(Node node);
}
