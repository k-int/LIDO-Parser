package app.java.parser.dao.complex.object;

import app.java.parser.model.complex.object.ObjectSetComplexType;
import org.w3c.dom.Node;

public interface ObjectSetComplexTypeDAO {
	/**
	 *
	 * @param node <b>lido:objectSetComplexType</b> node type.
	 * @return <b>ObjectSetComplexType</b>
	 */
	ObjectSetComplexType getObjectSetComplexType(Node node);
}
