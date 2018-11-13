package ro.webdata.lido.parser.parser.dao.complex.object;

import ro.webdata.lido.parser.parser.model.complex.object.ObjectMeasurementsComplexType;
import org.w3c.dom.Node;

public interface ObjectMeasurementsComplexTypeDAO {
	/**
	 *
	 * @param node <b>lido:objectMeasurementsComplexType</b> node type.
	 * @return <b>ObjectMeasurementsComplexType</b>
	 */
	ObjectMeasurementsComplexType getObjectMeasurementsComplexType(Node node);
}
