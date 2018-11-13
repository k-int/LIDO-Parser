package ro.webdata.lido.parser.parser.dao.element.leaf.measurements;

import ro.webdata.lido.parser.parser.model.element.leaf.measurements.ShapeMeasurements;
import org.w3c.dom.Node;

public interface ShapeMeasurementsDAO {
	/**
	 *
	 * @param node <b>lido:shapeMeasurements</b> node type.
	 * @return <b>ShapeMeasurements</b>
	 */
	ShapeMeasurements getShapeMeasurements(Node node);
}
