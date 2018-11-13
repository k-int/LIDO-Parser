package ro.webdata.lido.parser.parser.dao.element.wrap;

import ro.webdata.lido.parser.parser.model.element.wrap.RightsWorkWrap;
import org.w3c.dom.Node;

public interface RightsWorkWrapDAO {
	/**
	 *
	 * @param node <b>lido:rightsWorkWrap</b> node type.
	 * @return <b>RightsWorkWrap</b>
	 */
	RightsWorkWrap getRightsWorkWrapParser(Node node);
}
