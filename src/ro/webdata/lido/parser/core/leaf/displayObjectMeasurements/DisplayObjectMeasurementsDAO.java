package ro.webdata.lido.parser.core.leaf.displayObjectMeasurements;

import org.w3c.dom.Node;

public interface DisplayObjectMeasurementsDAO {
	/**
	 *
	 * @param node <b>lido:displayObjectMeasurements</b> node type.
	 * @return <b>DisplayObjectMeasurements</b>
	 */
	DisplayObjectMeasurements getDisplayObjectMeasurements(Node node);
}
