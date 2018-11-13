package ro.webdata.lido.parser.parser.dao.element.leaf.displayStateEdition;

import ro.webdata.lido.parser.parser.model.element.leaf.displayStateEdition.DisplayEdition;
import org.w3c.dom.Node;

public interface DisplayEditionDAO {
	/**
	 *
	 * @param node <b>lido:displayEdition</b> node type.
	 * @return <b>DisplayEdition</b>
	 */
	DisplayEdition getDisplayEdition(Node node);
}
