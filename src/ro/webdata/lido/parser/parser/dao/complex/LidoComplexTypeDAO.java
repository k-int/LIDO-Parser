package ro.webdata.lido.parser.parser.dao.complex;

import ro.webdata.lido.parser.parser.model.complex.LidoComplexType;
import org.w3c.dom.Node;

public interface LidoComplexTypeDAO {
	/**
	 *
	 * @param node <b>lido:lidoComplexType</b> node type.
	 * @return <b>LidoComplexType</b>
	 */
	LidoComplexType getLidoComplexType(Node node);
}
