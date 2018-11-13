package ro.webdata.lido.parser.parser.dao.element.leaf.displayStateEdition;

import ro.webdata.lido.parser.parser.model.element.leaf.displayStateEdition.DisplayState;
import org.w3c.dom.Node;

public interface DisplayStateDAO {
	/**
	 *
	 * @param node <b>lido:displayState</b> node type.
	 * @return <b>DisplayState</b>
	 */
	DisplayState getDisplayState(Node node);
}
