package app.java.parser.dao.element.wrap;

import app.java.parser.model.element.wrap.ObjectRelationWrap;
import org.w3c.dom.Node;

public interface ObjectRelationWrapDAO {
	/**
	 *
	 * @param node <b>lido:objectRelationWrap</b> node type.
	 * @return <b>ObjectRelationWrap</b>
	 */
	ObjectRelationWrap getObjectRelationWrap(Node node);
}
