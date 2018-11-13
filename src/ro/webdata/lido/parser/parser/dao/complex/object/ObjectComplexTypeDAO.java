package ro.webdata.lido.parser.parser.dao.complex.object;

import ro.webdata.lido.parser.parser.model.complex.object.ObjectComplexType;
import org.w3c.dom.Node;

public interface ObjectComplexTypeDAO {
	/**
	 *
	 * @param node <b>lido:objectComplexType</b> node type.
	 * @return <b>ObjectComplexType</b>
	 */
	ObjectComplexType getObjectComplexType(Node node);
}