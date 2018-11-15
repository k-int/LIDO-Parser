package ro.webdata.lido.parser.core.leaf.qualifierMeasurements;

import org.w3c.dom.Node;

public interface QualifierMeasurementsDAO {
	/**
	 *
	 * @param node <b>lido:qualifierMeasurements</b> node type.
	 * @return <b>QualifierMeasurements</b>
	 */
	QualifierMeasurements getQualifierMeasurements(Node node);
}
