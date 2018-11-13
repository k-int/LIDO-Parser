package ro.webdata.lido.parser.parser.dao.complex;

import ro.webdata.lido.parser.parser.model.complex.TermComplexType;
import org.w3c.dom.Node;

public interface TermComplexTypeDAO {
	/**
	 *
	 * @param node <b>lido:termComplexType</b> node type.
	 * @return <b>TermComplexType</b>
	 */
	TermComplexType getTermComplexType(Node node);
}
