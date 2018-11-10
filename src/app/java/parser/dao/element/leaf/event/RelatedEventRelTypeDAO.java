package app.java.parser.dao.element.leaf.event;

import app.java.parser.model.element.leaf.event.RelatedEventRelType;
import org.w3c.dom.Node;

public interface RelatedEventRelTypeDAO {
	/**
	 *
	 * @param node <b>lido:relatedEventRelType</b> node type.
	 * @return <b>RelatedEventRelType</b>
	 */
	RelatedEventRelType getRelatedEventRelType(Node node);
}
