package ro.webdata.lido.parser.core.leaf.date;

import org.w3c.dom.Node;

public interface DateDAO {
	/**
	 *
	 * @param node <b>lido:date</b> node type.
	 * @return <b>Date</b>
	 */
	Date getDate(Node node);
}
