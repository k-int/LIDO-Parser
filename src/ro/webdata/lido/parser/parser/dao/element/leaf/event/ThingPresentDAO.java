package ro.webdata.lido.parser.parser.dao.element.leaf.event;

import ro.webdata.lido.parser.parser.model.element.leaf.event.ThingPresent;
import org.w3c.dom.Node;

public interface ThingPresentDAO {
	/**
	 *
	 * @param node <b>lido:thingPresent</b> node type.
	 * @return <b>ThingPresent</b>
	 */
	ThingPresent getThingPresent(Node node);
}
