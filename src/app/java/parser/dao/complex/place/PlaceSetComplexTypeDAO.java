package app.java.parser.dao.complex.place;

import app.java.parser.model.complex.place.PlaceSetComplexType;
import org.w3c.dom.Node;

public interface PlaceSetComplexTypeDAO {
	/**
	 *
	 * @param node <b>lido:placeSetComplexType</b> node type.
	 * @return <b>PlaceSetComplexType</b>
	 */
	PlaceSetComplexType getPlaceSetComplexType(Node node);
}
