package ro.webdata.lido.parser.core.complex.objectSetComplexType;

import org.w3c.dom.Node;

public interface ObjectSetComplexTypeDAO {
	/**
	 *
	 * @param node <b>lido:objectSetComplexType</b> node type.
	 * @return <b>ObjectSetComplexType</b>
	 */
	ObjectSetComplexType getObjectSetComplexType(Node node);
}
