package app.java.parser.dao.complex.object;

import app.java.parser.model.complex.object.ObjectMeasurementsComplexType;
import org.w3c.dom.Node;

public interface ObjectMeasurementsComplexTypeDAO {
	/**
	 *
	 * @param node <b>lido:objectMeasurementsComplexType</b> node type.
	 * @return <b>ObjectMeasurementsComplexType</b>
	 */
	ObjectMeasurementsComplexType getObjectMeasurementsComplexType(Node node);
}
