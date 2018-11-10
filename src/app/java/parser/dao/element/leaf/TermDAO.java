package app.java.parser.dao.element.leaf;

import app.java.parser.model.element.leaf.Term;
import org.w3c.dom.Node;

public interface TermDAO {
	/**
	 *
	 * @param node <b>lido:term</b> node type.
	 * @return <b>Term</b>
	 */
	Term getTerm(Node node);
}
