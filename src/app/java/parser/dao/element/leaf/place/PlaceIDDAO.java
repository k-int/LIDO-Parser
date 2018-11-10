package app.java.parser.dao.element.leaf.place;

import app.java.parser.model.element.leaf.place.PlaceID;
import org.w3c.dom.Node;

public interface PlaceIDDAO {
	/**
	 *
	 * @param node <b>lido:placeID</b> node type.
	 * @return <b>getPlaceID</b>
	 */
	PlaceID getPlaceID(Node node);
}
