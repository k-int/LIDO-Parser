package app.java.parser.dao.element.wrap;

import app.java.parser.model.element.wrap.ObjectWorkTypeWrap;
import org.w3c.dom.Node;

public interface ObjectWorkTypeWrapDAO {
	/**
	 *
	 * @param node <b>lido:objectWorkTypeWrap</b> node type.
	 * @return <b>ObjectWorkTypeWrap</b>
	 */
	ObjectWorkTypeWrap getObjectWorkTypeWrap(Node node);
}
