package ro.webdata.lido.parser.parser.dao.element.set;

import ro.webdata.lido.parser.parser.model.element.set.MeasurementsSet;
import org.w3c.dom.Node;

public interface MeasurementsSetDAO {
	/**
	 *
	 * @param node <b>lido:measurementsSet</b> node type.
	 * @return <b>MeasurementsSet</b>
	 */
	MeasurementsSet getMeasurementsSet(Node node);
}
