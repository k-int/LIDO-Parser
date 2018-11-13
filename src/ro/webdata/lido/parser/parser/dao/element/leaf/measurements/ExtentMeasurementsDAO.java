package ro.webdata.lido.parser.parser.dao.element.leaf.measurements;

import ro.webdata.lido.parser.parser.model.element.leaf.measurements.ExtentMeasurements;
import org.w3c.dom.Node;

public interface ExtentMeasurementsDAO {
	/**
	 *
	 * @param node <b>lido:extentMeasurements</b> node type.
	 * @return <b>ExtentMeasurements</b>
	 */
	ExtentMeasurements getExtentMeasurements(Node node);
}
