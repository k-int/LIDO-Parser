package ro.webdata.lido.parser.parser.dao.element.set;

import ro.webdata.lido.parser.parser.model.element.set.ResourceMeasurementsSet;
import org.w3c.dom.Node;

public interface ResourceMeasurementsSetDAO {
	/**
	 *
	 * @param node <b>lido:resourceMeasurementsSet</b> node type.
	 * @return <b>ResourceMeasurementsSet</b>
	 */
	ResourceMeasurementsSet getResourceMeasurementsSet(Node node);
}
