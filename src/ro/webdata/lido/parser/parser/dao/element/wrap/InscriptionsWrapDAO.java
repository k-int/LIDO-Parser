package ro.webdata.lido.parser.parser.dao.element.wrap;

import ro.webdata.lido.parser.parser.model.element.wrap.InscriptionsWrap;
import org.w3c.dom.Node;

public interface InscriptionsWrapDAO {
	/**
	 *
	 * @param node <b>lido:inscriptionsWrap</b> node type.
	 * @return <b>InscriptionsWrap</b>
	 */
	InscriptionsWrap getInscriptionsWrap(Node node);
}
