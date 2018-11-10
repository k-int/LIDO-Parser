package app.java.parser.dao.element.set;

import app.java.parser.model.element.set.ObjectMeasurementsSet;
import org.w3c.dom.Node;

public interface ObjectMeasurementsSetDAO {
	/**
	 *
	 * @param node <b>lido:objectMeasurementsSet</b> node type.
	 * @return <b>ObjectMeasurementsSet</b>
	 */
	ObjectMeasurementsSet getObjectMeasurementsSet(Node node);
}
