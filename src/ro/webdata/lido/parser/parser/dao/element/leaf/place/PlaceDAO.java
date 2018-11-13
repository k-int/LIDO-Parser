package ro.webdata.lido.parser.parser.dao.element.leaf.place;

import ro.webdata.lido.parser.parser.model.element.leaf.place.Place;
import org.w3c.dom.Node;

public interface PlaceDAO {
	/**
	 *
	 * @param node <b>lido:place</b> node type.
	 * @return <b>Place</b>
	 */
	Place getPlace(Node node);
}
