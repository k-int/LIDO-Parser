package ro.webdata.lido.parser.core.leaf.displayState;

import org.w3c.dom.Node;

public interface DisplayStateDAO {
	/**
	 *
	 * @param node <b>lido:displayState</b> node type.
	 * @return <b>DisplayState</b>
	 */
	DisplayState getDisplayState(Node node);
}
