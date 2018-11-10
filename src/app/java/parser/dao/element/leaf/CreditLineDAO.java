package app.java.parser.dao.element.leaf;

import app.java.parser.model.element.leaf.CreditLine;
import org.w3c.dom.Node;

public interface CreditLineDAO {
	/**
	 *
	 * @param node <b>lido:creditLine</b> node type.
	 * @return <b>CreditLine</b>
	 */
	CreditLine getCreditLine(Node node);
}
