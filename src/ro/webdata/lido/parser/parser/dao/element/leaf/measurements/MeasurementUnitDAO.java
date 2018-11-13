package ro.webdata.lido.parser.parser.dao.element.leaf.measurements;

import ro.webdata.lido.parser.parser.model.element.leaf.measurements.MeasurementUnit;
import org.w3c.dom.Node;

public interface MeasurementUnitDAO {
	/**
	 *
	 * @param node <b>lido:measurementUnit</b> node type.
	 * @return <b>MeasurementUnit</b>
	 */
	MeasurementUnit getMeasurementUnit(Node node);
}
