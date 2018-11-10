package app.java.parser.dao.complex;

import app.java.parser.model.complex.GmlComplexType;
import org.w3c.dom.Node;

public interface GmlComplexTypeDAO {
	/**
	 *
	 * @param node <b>lido:gmlComplexType</b> node type.
	 * @return <b>GmlComplexType</b>
	 */
	GmlComplexType getGmlComplexType(Node node);
}
