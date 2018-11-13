package ro.webdata.lido.parser.parser.dao.element.leaf.measurements;

import ro.webdata.lido.parser.parser.model.element.leaf.measurements.MeasurementValue;
import org.w3c.dom.Node;

public interface MeasurementValueDAO {
	/**
	 *
	 * @param node <b>lido:measurementValue</b> node type.
	 * @return <b>MeasurementValue</b>
	 */
	MeasurementValue getMeasurementValue(Node node);
}
