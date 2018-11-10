package app.java.parser.dao.element.leaf.measurements;

import app.java.parser.model.element.leaf.measurements.ScaleMeasurements;
import org.w3c.dom.Node;

public interface ScaleMeasurementsDAO {
	/**
	 *
	 * @param node <b>lido:scaleMeasurements</b> node type.
	 * @return <b>ScaleMeasurements</b>
	 */
	ScaleMeasurements getScaleMeasurements(Node node);
}
