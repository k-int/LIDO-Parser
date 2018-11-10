package app.java.parser.dao.element.wrap;

import app.java.parser.model.element.wrap.TitleWrap;
import org.w3c.dom.Node;

public interface TitleWrapDAO {
	/**
	 *
	 * @param node <b>lido:titleWrap</b> node type.
	 * @return <b>TitleWrap</b>
	 */
	TitleWrap getTitleWrap(Node node);
}
