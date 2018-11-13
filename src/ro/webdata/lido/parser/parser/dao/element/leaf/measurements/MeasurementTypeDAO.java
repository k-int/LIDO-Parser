package ro.webdata.lido.parser.parser.dao.element.leaf.measurements;

import ro.webdata.lido.parser.parser.model.element.leaf.measurements.MeasurementType;
import org.w3c.dom.Node;

public interface MeasurementTypeDAO {
	/**
	 *
	 * @param node <b>lido:measurementType</b> node type.
	 * @return <b>MeasurementType</b>
	 */
	MeasurementType getMeasurementType(Node node);
}
