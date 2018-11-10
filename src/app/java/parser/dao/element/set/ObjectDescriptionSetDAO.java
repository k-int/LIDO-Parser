package app.java.parser.dao.element.set;

import app.java.parser.model.element.set.ObjectDescriptionSet;
import org.w3c.dom.Node;

public interface ObjectDescriptionSetDAO {
	/**
	 *
	 * @param node <b>lido:objectDescriptionSet</b> node type.
	 * @return <b>ObjectDescriptionSet</b>
	 */
	ObjectDescriptionSet getObjectDescriptionSet(Node node);
}
