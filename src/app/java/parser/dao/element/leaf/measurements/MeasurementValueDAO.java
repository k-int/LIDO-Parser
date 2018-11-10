package app.java.parser.dao.element.leaf.measurements;

import app.java.parser.model.element.leaf.measurements.MeasurementValue;
import org.w3c.dom.Node;

public interface MeasurementValueDAO {
	/**
	 *
	 * @param node <b>lido:measurementValue</b> node type.
	 * @return <b>MeasurementValue</b>
	 */
	MeasurementValue getMeasurementValue(Node node);
}
