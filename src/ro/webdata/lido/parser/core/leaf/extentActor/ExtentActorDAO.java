package ro.webdata.lido.parser.core.leaf.extentActor;

import org.w3c.dom.Node;

public interface ExtentActorDAO {
	/**
	 *
	 * @param node <b>lido:extentActor</b> node type.
	 * @return <b>DisplayActorInRole</b>
	 */
	ExtentActor getExtentActor(Node node);
}
