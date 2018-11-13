package ro.webdata.lido.parser.parser.dao.element.wrap;

import ro.webdata.lido.parser.parser.model.element.wrap.ObjectWorkTypeWrap;
import org.w3c.dom.Node;

public interface ObjectWorkTypeWrapDAO {
	/**
	 *
	 * @param node <b>lido:objectWorkTypeWrap</b> node type.
	 * @return <b>ObjectWorkTypeWrap</b>
	 */
	ObjectWorkTypeWrap getObjectWorkTypeWrap(Node node);
}
