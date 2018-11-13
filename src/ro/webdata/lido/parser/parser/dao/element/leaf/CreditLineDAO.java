package ro.webdata.lido.parser.parser.dao.element.leaf;

import ro.webdata.lido.parser.parser.model.element.leaf.CreditLine;
import org.w3c.dom.Node;

public interface CreditLineDAO {
	/**
	 *
	 * @param node <b>lido:creditLine</b> node type.
	 * @return <b>CreditLine</b>
	 */
	CreditLine getCreditLine(Node node);
}
