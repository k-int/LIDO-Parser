package ro.webdata.lido.parser.parser.dao.element.leaf.actor;

import ro.webdata.lido.parser.parser.model.element.leaf.actor.DisplayActor;
import org.w3c.dom.Node;

public interface DisplayActorDAO {
	/**
	 *
	 * @param node <b>lido:displayActor</b> node type.
	 * @return <b>DisplayActor</b>
	 */
	DisplayActor getDisplayActor(Node node);
}
