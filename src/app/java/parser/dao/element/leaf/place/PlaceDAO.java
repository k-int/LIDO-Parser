package app.java.parser.dao.element.leaf.place;

import app.java.parser.model.element.leaf.place.Place;
import org.w3c.dom.Node;

public interface PlaceDAO {
	/**
	 *
	 * @param node <b>lido:place</b> node type.
	 * @return <b>Place</b>
	 */
	Place getPlace(Node node);
}
