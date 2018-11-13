package ro.webdata.lido.parser.parser.dao.element.leaf.event;

import ro.webdata.lido.parser.parser.model.element.leaf.event.RelatedEvent;
import org.w3c.dom.Node;

public interface RelatedEventDAO {
	/**
	 *
	 * @param node <b>lido:relatedEvent</b> node type.
	 * @return <b>RelatedEvent</b>
	 */
	RelatedEvent getRelatedEvent(Node node);
}
