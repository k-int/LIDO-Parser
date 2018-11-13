package ro.webdata.lido.parser.parser.dao.element.leaf.place;

import ro.webdata.lido.parser.parser.model.element.leaf.place.PartOfPlace;
import org.w3c.dom.Node;

public interface PartOfPlaceDAO {
	/**
	 *
	 * @param node <b>lido:partOfPlace</b> node type.
	 * @return <b>PartOfPlace</b>
	 */
	PartOfPlace getPartOfPlace(Node node);
}
