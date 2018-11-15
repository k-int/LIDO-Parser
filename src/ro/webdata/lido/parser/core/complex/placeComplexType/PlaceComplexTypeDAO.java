package ro.webdata.lido.parser.core.complex.placeComplexType;

import org.w3c.dom.Node;

public interface PlaceComplexTypeDAO {
	/**
	 *
	 * @param node <b>lido:placeComplexType</b> node type.
	 * @return <b>PlaceComplexType</b>
	 */
	PlaceComplexType getPlaceComplexType(Node node);
}
