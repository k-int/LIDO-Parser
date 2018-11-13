package ro.webdata.lido.parser.parser.dao.element.leaf;

import ro.webdata.lido.parser.parser.model.element.leaf.LinkResource;
import org.w3c.dom.Node;

public interface LinkResourceDAO {
	/**
	 *
	 * @param node <b>lido:linkResource</b> node type.
	 * @return <b>LinkResource</b>
	 */
	LinkResource getLinkResource(Node node);
}
