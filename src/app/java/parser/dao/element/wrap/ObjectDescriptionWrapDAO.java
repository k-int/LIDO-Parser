package app.java.parser.dao.element.wrap;

import app.java.parser.model.element.wrap.ObjectDescriptionWrap;
import org.w3c.dom.Node;

public interface ObjectDescriptionWrapDAO {
	/**
	 *
	 * @param node <b>lido:objectDescriptionWrap</b> node type.
	 * @return <b>ObjectDescriptionWrap</b>
	 */
	ObjectDescriptionWrap getObjectDescriptionWrap(Node node);
}
