package app.java.parser.dao.element.leaf.measurements;

import app.java.parser.model.element.leaf.measurements.QualifierMeasurements;
import org.w3c.dom.Node;

public interface QualifierMeasurementsDAO {
	/**
	 *
	 * @param node <b>lido:qualifierMeasurements</b> node type.
	 * @return <b>QualifierMeasurements</b>
	 */
	QualifierMeasurements getQualifierMeasurements(Node node);
}
