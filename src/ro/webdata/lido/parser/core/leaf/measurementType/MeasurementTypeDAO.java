package ro.webdata.lido.parser.core.leaf.measurementType;

import org.w3c.dom.Node;

public interface MeasurementTypeDAO {
	/**
	 *
	 * @param node <b>lido:measurementType</b> node type.
	 * @return <b>MeasurementType</b>
	 */
	MeasurementType getMeasurementType(Node node);
}
