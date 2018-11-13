package ro.webdata.lido.parser.parser.dao.element.leaf.event;

import ro.webdata.lido.parser.parser.model.element.leaf.event.EventMaterialsTech;
import org.w3c.dom.Node;

public interface EventMaterialsTechDAO {
	/**
	 *
	 * @param node <b>lido:eventMaterialsTech</b> node type.
	 * @return <b>EventMaterialsTech</b>
	 */
	EventMaterialsTech getEventMaterialsTech(Node node);
}
