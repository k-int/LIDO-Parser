package app.java.parser.dao.element.set;

import app.java.parser.model.element.set.ResourceMeasurementsSet;
import org.w3c.dom.Node;

public interface ResourceMeasurementsSetDAO {
	/**
	 *
	 * @param node <b>lido:resourceMeasurementsSet</b> node type.
	 * @return <b>ResourceMeasurementsSet</b>
	 */
	ResourceMeasurementsSet getResourceMeasurementsSet(Node node);
}
