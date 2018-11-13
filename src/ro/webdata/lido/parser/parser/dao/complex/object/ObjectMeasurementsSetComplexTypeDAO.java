package ro.webdata.lido.parser.parser.dao.complex.object;

import ro.webdata.lido.parser.parser.model.complex.object.ObjectMeasurementsSetComplexType;
import org.w3c.dom.Node;

public interface ObjectMeasurementsSetComplexTypeDAO {/**
	 *
	 * @param node <b>lido:objectMeasurementsSetComplexType</b> node type.
	 * @return <b>ObjectMeasurementsSetComplexType</b>
	 */
	ObjectMeasurementsSetComplexType getObjectMeasurementsSetComplexType(Node node);
}
