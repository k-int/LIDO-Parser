package ro.webdata.lido.parser.parser.dao.element.wrap;

import ro.webdata.lido.parser.parser.model.element.wrap.DisplayStateEditionWrap;
import org.w3c.dom.Node;

public interface DisplayStateEditionWrapDAO {
	/**
	 *
	 * @param node <b>lido:displayStateEditionWrap</b> node type.
	 * @return <b>DisplayStateEditionWrap</b>
	 */
	DisplayStateEditionWrap getDisplayStateEditionWrap(Node node);
}
