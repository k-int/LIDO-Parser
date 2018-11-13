package ro.webdata.lido.parser.parser.dao.element.wrap;

import ro.webdata.lido.parser.parser.model.element.wrap.TitleWrap;
import org.w3c.dom.Node;

public interface TitleWrapDAO {
	/**
	 *
	 * @param node <b>lido:titleWrap</b> node type.
	 * @return <b>TitleWrap</b>
	 */
	TitleWrap getTitleWrap(Node node);
}
