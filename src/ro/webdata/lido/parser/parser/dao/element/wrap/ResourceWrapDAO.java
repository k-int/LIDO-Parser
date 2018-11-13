package ro.webdata.lido.parser.parser.dao.element.wrap;

import ro.webdata.lido.parser.parser.model.element.wrap.ResourceWrap;
import org.w3c.dom.Node;

public interface ResourceWrapDAO {
	/**
	 *
	 * @param node <b>lido:resourceWrap</b> node type.
	 * @return <b>ResourceWrap</b>
	 */
	ResourceWrap getResourceWrap(Node node);
}
