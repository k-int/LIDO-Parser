package ro.webdata.lido.parser.parser.dao.element.leaf.measurements;

import ro.webdata.lido.parser.parser.model.element.leaf.measurements.ScaleMeasurements;
import org.w3c.dom.Node;

public interface ScaleMeasurementsDAO {
	/**
	 *
	 * @param node <b>lido:scaleMeasurements</b> node type.
	 * @return <b>ScaleMeasurements</b>
	 */
	ScaleMeasurements getScaleMeasurements(Node node);
}
