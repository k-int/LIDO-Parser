package ro.webdata.lido.parser.parser.dao.element.leaf.actor;

import ro.webdata.lido.parser.parser.model.element.leaf.actor.Actor;
import org.w3c.dom.Node;

public interface ActorDAO {
	/**
	 *
	 * @param node <b>lido:actor</b> node type.
	 * @return <b>Actor</b>
	 */
	Actor getActor(Node node);
}
