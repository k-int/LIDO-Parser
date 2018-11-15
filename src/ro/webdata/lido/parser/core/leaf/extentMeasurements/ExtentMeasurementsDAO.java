package ro.webdata.lido.parser.core.leaf.extentMeasurements;

import org.w3c.dom.Node;

public interface ExtentMeasurementsDAO {
	/**
	 *
	 * @param node <b>lido:extentMeasurements</b> node type.
	 * @return <b>ExtentMeasurements</b>
	 */
	ExtentMeasurements getExtentMeasurements(Node node);
}
