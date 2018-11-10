package app.java.parser.dao.element.leaf.object;

import app.java.parser.model.element.leaf.object.ObjectWorkType;
import org.w3c.dom.Node;

public interface ObjectWorkTypeDAO {
	/**
	 *
	 * @param node <b>lido:objectWorkType</b> node type.
	 * @return <b>ObjectWorkType</b>
	 */
	ObjectWorkType getObjectWorkType(Node node);
}
