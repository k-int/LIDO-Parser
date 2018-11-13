package ro.webdata.lido.parser.parser.dao.element.leaf;

import ro.webdata.lido.parser.parser.model.element.leaf.AppellationValue;
import org.w3c.dom.Node;

public interface AppellationValueDAO {
	/**
	 *
	 * @param node <b>lido:appellationValue</b> node type.
	 * @return <b>AppellationValue</b>
	 */
	AppellationValue getAppellationValue(Node node);
}
