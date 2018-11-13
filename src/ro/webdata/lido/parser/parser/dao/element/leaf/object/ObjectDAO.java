package ro.webdata.lido.parser.parser.dao.element.leaf.object;

import ro.webdata.lido.parser.parser.model.element.leaf.object.Object;
import org.w3c.dom.Node;

public interface ObjectDAO {
	/**
	 *
	 * @param node <b>lido:object</b> node type.
	 * @return <b>Object</b>
	 */
	Object getObject(Node node);
}
