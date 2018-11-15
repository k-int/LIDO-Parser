package ro.webdata.lido.parser.core.set.measurementsSet;

import org.w3c.dom.Node;

public interface MeasurementsSetDAO {
	/**
	 *
	 * @param node <b>lido:measurementsSet</b> node type.
	 * @return <b>MeasurementsSet</b>
	 */
	MeasurementsSet getMeasurementsSet(Node node);
}
