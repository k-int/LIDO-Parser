package ro.webdata.lido.parser.parser.dao.element.leaf.object;

import ro.webdata.lido.parser.parser.model.element.leaf.object.ObjectMeasurements;
import org.w3c.dom.Node;

public interface ObjectMeasurementsDAO {
	/**
	 *
	 * @param node <b>lido:objectMeasurements</b> node type.
	 * @return <b>ObjectMeasurements</b>
	 */
	ObjectMeasurements getObjectMeasurements(Node node);
}
