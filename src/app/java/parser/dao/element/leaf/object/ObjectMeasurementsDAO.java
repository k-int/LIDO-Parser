package app.java.parser.dao.element.leaf.object;

import app.java.parser.model.element.leaf.object.ObjectMeasurements;
import org.w3c.dom.Node;

public interface ObjectMeasurementsDAO {
	/**
	 *
	 * @param node <b>lido:objectMeasurements</b> node type.
	 * @return <b>ObjectMeasurements</b>
	 */
	ObjectMeasurements getObjectMeasurements(Node node);
}
