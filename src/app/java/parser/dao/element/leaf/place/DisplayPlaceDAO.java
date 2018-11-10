package app.java.parser.dao.element.leaf.place;

import app.java.parser.model.element.leaf.place.DisplayPlace;
import org.w3c.dom.Node;

public interface DisplayPlaceDAO {
	/**
	 *
	 * @param node <b>lido:displayPlace</b> node type.
	 * @return <b>DisplayPlace</b>
	 */
	DisplayPlace getDisplayPlace(Node node);
}
