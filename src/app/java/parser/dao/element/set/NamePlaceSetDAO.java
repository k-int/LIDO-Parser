package app.java.parser.dao.element.set;

import app.java.parser.model.element.set.NamePlaceSet;
import org.w3c.dom.Node;

public interface NamePlaceSetDAO {
	/**
	 *
	 * @param node <b>lido:namePlaceSet</b> node type.
	 * @return <b>NamePlaceSet</b>
	 */
	NamePlaceSet getNamePlaceSet(Node node);
}
