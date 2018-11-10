package app.java.parser.dao.element.leaf;

import app.java.parser.model.element.leaf.AppellationValue;
import org.w3c.dom.Node;

public interface AppellationValueDAO {
	/**
	 *
	 * @param node <b>lido:appellationValue</b> node type.
	 * @return <b>AppellationValue</b>
	 */
	AppellationValue getAppellationValue(Node node);
}
