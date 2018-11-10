package app.java.parser.dao.complex.object;

import app.java.parser.model.complex.object.ObjectMeasurementsSetComplexType;
import org.w3c.dom.Node;

public interface ObjectMeasurementsSetComplexTypeDAO {/**
	 *
	 * @param node <b>lido:objectMeasurementsSetComplexType</b> node type.
	 * @return <b>ObjectMeasurementsSetComplexType</b>
	 */
	ObjectMeasurementsSetComplexType getObjectMeasurementsSetComplexType(Node node);
}
