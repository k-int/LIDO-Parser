package ro.webdata.lido.parser.parser.dao.element.leaf;

import ro.webdata.lido.parser.parser.model.element.leaf.SourceAppellation;
import org.w3c.dom.Node;

public interface SourceAppellationDAO {
	/**
	 *
	 * @param node <b>lido:sourceAppellation</b> node type.
	 * @return <b>SourceAppellationDAO</b>
	 */
	SourceAppellation getSourceAppellation(Node node);
}
