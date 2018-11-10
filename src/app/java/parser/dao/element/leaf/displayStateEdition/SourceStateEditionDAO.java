package app.java.parser.dao.element.leaf.displayStateEdition;

import app.java.parser.model.element.leaf.displayStateEdition.SourceStateEdition;
import org.w3c.dom.Node;

public interface SourceStateEditionDAO {
	/**
	 *
	 * @param node <b>lido:sourceStateEdition</b> node type.
	 * @return <b>SourceStateEdition</b>
	 */
	SourceStateEdition getSourceStateEdition(Node node);
}
