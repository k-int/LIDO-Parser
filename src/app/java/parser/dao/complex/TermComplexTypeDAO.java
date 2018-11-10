package app.java.parser.dao.complex;

import app.java.parser.model.complex.TermComplexType;
import org.w3c.dom.Node;

public interface TermComplexTypeDAO {
	/**
	 *
	 * @param node <b>lido:termComplexType</b> node type.
	 * @return <b>TermComplexType</b>
	 */
	TermComplexType getTermComplexType(Node node);
}
