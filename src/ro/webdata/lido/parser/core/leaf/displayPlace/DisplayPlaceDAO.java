package ro.webdata.lido.parser.core.leaf.displayPlace;

import org.w3c.dom.Node;

public interface DisplayPlaceDAO {
	/**
	 *
	 * @param node <b>lido:displayPlace</b> node type.
	 * @return <b>DisplayPlace</b>
	 */
	DisplayPlace getDisplayPlace(Node node);
}
