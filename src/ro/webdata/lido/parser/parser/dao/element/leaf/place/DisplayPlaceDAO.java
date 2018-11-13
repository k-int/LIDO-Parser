package ro.webdata.lido.parser.parser.dao.element.leaf.place;

import ro.webdata.lido.parser.parser.model.element.leaf.place.DisplayPlace;
import org.w3c.dom.Node;

public interface DisplayPlaceDAO {
	/**
	 *
	 * @param node <b>lido:displayPlace</b> node type.
	 * @return <b>DisplayPlace</b>
	 */
	DisplayPlace getDisplayPlace(Node node);
}
