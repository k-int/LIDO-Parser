package ro.webdata.lido.parser.parser.dao.complex;

import ro.webdata.lido.parser.parser.model.complex.LegalBodyRefComplexType;
import org.w3c.dom.Node;

public interface LegalBodyRefComplexTypeDAO {
	/**
	 *
	 * @param node <b>lido:legalBodyRefComplexType</b> node type.
	 * @return <b>LegalBodyRefComplexType</b>
	 */
	LegalBodyRefComplexType getLegalBodyRefComplexType(Node node);
}
