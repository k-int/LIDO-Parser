package ro.webdata.lido.parser.parser.dao.element.leaf.place;

import ro.webdata.lido.parser.parser.model.element.leaf.place.PlaceClassification;
import org.w3c.dom.Node;

public interface PlaceClassificationDAO {
	/**
	 *
	 * @param node <b>lido:placeClassification</b> node type.
	 * @return <b>PlaceClassification</b>
	 */
	PlaceClassification getPlaceClassification(Node node);
}
