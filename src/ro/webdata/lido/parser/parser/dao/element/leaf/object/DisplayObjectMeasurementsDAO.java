package ro.webdata.lido.parser.parser.dao.element.leaf.object;

import ro.webdata.lido.parser.parser.model.element.leaf.object.DisplayObjectMeasurements;
import org.w3c.dom.Node;

public interface DisplayObjectMeasurementsDAO {
	/**
	 *
	 * @param node <b>lido:displayObjectMeasurements</b> node type.
	 * @return <b>DisplayObjectMeasurements</b>
	 */
	DisplayObjectMeasurements getDisplayObjectMeasurements(Node node);
}
