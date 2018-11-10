package app.java.parser.dao.element.wrap;

import app.java.parser.model.element.wrap.InscriptionsWrap;
import org.w3c.dom.Node;

public interface InscriptionsWrapDAO {
	/**
	 *
	 * @param node <b>lido:inscriptionsWrap</b> node type.
	 * @return <b>InscriptionsWrap</b>
	 */
	InscriptionsWrap getInscriptionsWrap(Node node);
}
