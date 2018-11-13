package ro.webdata.lido.parser.parser.dao.element.set;

import ro.webdata.lido.parser.parser.model.element.set.TitleSet;
import org.w3c.dom.Node;

public interface TitleSetDAO {
	/**
	 *
	 * @param node <b>lido:titleSet</b> node type.
	 * @return <b>TitleSet</b>
	 */
	TitleSet getTitleSet(Node node);
}
