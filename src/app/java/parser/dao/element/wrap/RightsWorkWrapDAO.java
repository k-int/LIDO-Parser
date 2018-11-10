package app.java.parser.dao.element.wrap;

import app.java.parser.model.element.wrap.RightsWorkWrap;
import org.w3c.dom.Node;

public interface RightsWorkWrapDAO {
	/**
	 *
	 * @param node <b>lido:rightsWorkWrap</b> node type.
	 * @return <b>RightsWorkWrap</b>
	 */
	RightsWorkWrap getRightsWorkWrapParser(Node node);
}
