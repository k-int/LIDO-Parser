package app.java.parser.dao.complex;

import app.java.parser.model.complex.WebResourceComplexType;
import org.w3c.dom.Node;

public interface WebResourceComplexTypeDAO {
	/**
	 *
	 * @param node <b>lido:webResourceComplexType</b> node type.
	 * @return <b>WebResourceComplexType</b>
	 */
	WebResourceComplexType getWebResourceComplexType(Node node);
}
