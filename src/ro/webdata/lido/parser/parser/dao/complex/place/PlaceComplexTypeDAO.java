package ro.webdata.lido.parser.parser.dao.complex.place;

import ro.webdata.lido.parser.parser.model.complex.place.PlaceComplexType;
import org.w3c.dom.Node;

public interface PlaceComplexTypeDAO {
	/**
	 *
	 * @param node <b>lido:placeComplexType</b> node type.
	 * @return <b>PlaceComplexType</b>
	 */
	PlaceComplexType getPlaceComplexType(Node node);
}
