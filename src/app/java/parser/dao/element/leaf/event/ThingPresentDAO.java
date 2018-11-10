package app.java.parser.dao.element.leaf.event;

import app.java.parser.model.element.leaf.event.ThingPresent;
import org.w3c.dom.Node;

public interface ThingPresentDAO {
	/**
	 *
	 * @param node <b>lido:thingPresent</b> node type.
	 * @return <b>ThingPresent</b>
	 */
	ThingPresent getThingPresent(Node node);
}
