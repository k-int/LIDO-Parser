package ro.webdata.lido.parser.parser.dao.complex;

import ro.webdata.lido.parser.parser.model.complex.MeasurementsSetComplexType;
import org.w3c.dom.Node;

public interface MeasurementsSetComplexTypeDAO {
	/**
	 *
	 * @param node <b>lido:measurementsSetComplexType</b> node type.
	 * @return <b>MeasurementsSetComplexType</b>
	 */
	MeasurementsSetComplexType getMeasurementsSetComplexType(Node node);
}
