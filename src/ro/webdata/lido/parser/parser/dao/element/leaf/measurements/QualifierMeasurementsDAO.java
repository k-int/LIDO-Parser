package ro.webdata.lido.parser.parser.dao.element.leaf.measurements;

import ro.webdata.lido.parser.parser.model.element.leaf.measurements.QualifierMeasurements;
import org.w3c.dom.Node;

public interface QualifierMeasurementsDAO {
	/**
	 *
	 * @param node <b>lido:qualifierMeasurements</b> node type.
	 * @return <b>QualifierMeasurements</b>
	 */
	QualifierMeasurements getQualifierMeasurements(Node node);
}
