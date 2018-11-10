package app.java.parser.dao.complex.object;

import app.java.parser.model.complex.object.ObjectComplexType;
import org.w3c.dom.Node;

public interface ObjectComplexTypeDAO {
	/**
	 *
	 * @param node <b>lido:objectComplexType</b> node type.
	 * @return <b>ObjectComplexType</b>
	 */
	ObjectComplexType getObjectComplexType(Node node);
}
