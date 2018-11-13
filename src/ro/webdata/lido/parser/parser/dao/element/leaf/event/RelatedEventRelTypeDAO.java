package ro.webdata.lido.parser.parser.dao.element.leaf.event;

import ro.webdata.lido.parser.parser.model.element.leaf.event.RelatedEventRelType;
import org.w3c.dom.Node;

public interface RelatedEventRelTypeDAO {
	/**
	 *
	 * @param node <b>lido:relatedEventRelType</b> node type.
	 * @return <b>RelatedEventRelType</b>
	 */
	RelatedEventRelType getRelatedEventRelType(Node node);
}
