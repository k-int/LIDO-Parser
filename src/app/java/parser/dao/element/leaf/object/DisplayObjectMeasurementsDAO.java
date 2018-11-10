package app.java.parser.dao.element.leaf.object;

import app.java.parser.model.element.leaf.object.DisplayObjectMeasurements;
import org.w3c.dom.Node;

public interface DisplayObjectMeasurementsDAO {
	/**
	 *
	 * @param node <b>lido:displayObjectMeasurements</b> node type.
	 * @return <b>DisplayObjectMeasurements</b>
	 */
	DisplayObjectMeasurements getDisplayObjectMeasurements(Node node);
}
