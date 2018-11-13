package ro.webdata.lido.parser.parser.dao.element.leaf.actor;

import ro.webdata.lido.parser.parser.model.element.leaf.actor.AttributionQualifierActor;
import org.w3c.dom.Node;

public interface AttributionQualifierActorDAO {
	/**
	 *
	 * @param node <b>lido:attributionQualifierActor</b> node type.
	 * @return <b>AttributionQualifierActor</b>
	 */
	AttributionQualifierActor getAttributionQualifierActor(Node node);
}
