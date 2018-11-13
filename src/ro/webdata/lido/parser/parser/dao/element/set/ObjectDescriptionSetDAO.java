package ro.webdata.lido.parser.parser.dao.element.set;

import ro.webdata.lido.parser.parser.model.element.set.ObjectDescriptionSet;
import org.w3c.dom.Node;

public interface ObjectDescriptionSetDAO {
	/**
	 *
	 * @param node <b>lido:objectDescriptionSet</b> node type.
	 * @return <b>ObjectDescriptionSet</b>
	 */
	ObjectDescriptionSet getObjectDescriptionSet(Node node);
}
