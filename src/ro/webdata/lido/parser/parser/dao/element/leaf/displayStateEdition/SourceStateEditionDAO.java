package ro.webdata.lido.parser.parser.dao.element.leaf.displayStateEdition;

import ro.webdata.lido.parser.parser.model.element.leaf.displayStateEdition.SourceStateEdition;
import org.w3c.dom.Node;

public interface SourceStateEditionDAO {
	/**
	 *
	 * @param node <b>lido:sourceStateEdition</b> node type.
	 * @return <b>SourceStateEdition</b>
	 */
	SourceStateEdition getSourceStateEdition(Node node);
}
