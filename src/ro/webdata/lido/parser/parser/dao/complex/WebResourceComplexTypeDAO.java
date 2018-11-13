package ro.webdata.lido.parser.parser.dao.complex;

import ro.webdata.lido.parser.parser.model.complex.WebResourceComplexType;
import org.w3c.dom.Node;

public interface WebResourceComplexTypeDAO {
	/**
	 *
	 * @param node <b>lido:webResourceComplexType</b> node type.
	 * @return <b>WebResourceComplexType</b>
	 */
	WebResourceComplexType getWebResourceComplexType(Node node);
}
