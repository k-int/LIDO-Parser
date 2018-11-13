package ro.webdata.lido.parser.parser.dao.element.leaf.actor;

import ro.webdata.lido.parser.parser.model.element.leaf.actor.ExtentActor;
import org.w3c.dom.Node;

public interface ExtentActorDAO {
	/**
	 *
	 * @param node <b>lido:extentActor</b> node type.
	 * @return <b>DisplayActorInRole</b>
	 */
	ExtentActor getExtentActor(Node node);
}
