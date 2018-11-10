package app.java.parser.dao.complex;

import app.java.parser.model.complex.TextComplexType;
import org.w3c.dom.Node;

public interface TextComplexTypeDAO {
	/**
	 *
	 * @param node <b>lido:textComplexType</b> node type.
	 * @return <b>TextComplexType</b>
	 */
	TextComplexType getTextComplexType(Node node);
}
