package app.java.parser.dao.element.set;

import app.java.parser.model.element.set.TitleSet;
import org.w3c.dom.Node;

public interface TitleSetDAO {
	/**
	 *
	 * @param node <b>lido:titleSet</b> node type.
	 * @return <b>TitleSet</b>
	 */
	TitleSet getTitleSet(Node node);
}
