package ro.webdata.lido.parser.parser.dao.element.wrap;

import ro.webdata.lido.parser.parser.model.element.wrap.EventWrap;
import org.w3c.dom.Node;

public interface EventWrapDAO {
	/**
	 *
	 * @param node <b>lido:eventWrap</b> node type.
	 * @return <b>EventWrap</b>
	 */
	EventWrap getEventWrap(Node node);
}
