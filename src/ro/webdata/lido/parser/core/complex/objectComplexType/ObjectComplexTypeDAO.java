package ro.webdata.lido.parser.core.complex.objectComplexType;

import org.w3c.dom.Node;

public interface ObjectComplexTypeDAO {
	/**
	 *
	 * @param node <b>lido:objectComplexType</b> node type.
	 * @return <b>ObjectComplexType</b>
	 */
	ObjectComplexType getObjectComplexType(Node node);
}
