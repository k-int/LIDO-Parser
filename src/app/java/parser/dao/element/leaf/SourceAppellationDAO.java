package app.java.parser.dao.element.leaf;

import app.java.parser.model.element.leaf.SourceAppellation;
import org.w3c.dom.Node;

public interface SourceAppellationDAO {
	/**
	 *
	 * @param node <b>lido:sourceAppellation</b> node type.
	 * @return <b>SourceAppellationDAO</b>
	 */
	SourceAppellation getSourceAppellation(Node node);
}
