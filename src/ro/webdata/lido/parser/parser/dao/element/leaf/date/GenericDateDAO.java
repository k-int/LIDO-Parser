package ro.webdata.lido.parser.parser.dao.element.leaf.date;

import ro.webdata.lido.parser.parser.model.element.leaf.date.GenericDate;
import org.w3c.dom.Node;

public interface GenericDateDAO {
	/**
	 *
	 * @param node <b>lido:earliestDate</b> and <b>lido:latestDate</b> node types.
	 * @return <b>GenericDate</b>
	 */
	GenericDate getGenericDate(Node node);
}
