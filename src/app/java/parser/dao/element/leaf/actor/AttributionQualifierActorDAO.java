package app.java.parser.dao.element.leaf.actor;

import app.java.parser.model.element.leaf.actor.AttributionQualifierActor;
import org.w3c.dom.Node;

public interface AttributionQualifierActorDAO {
	/**
	 *
	 * @param node <b>lido:attributionQualifierActor</b> node type.
	 * @return <b>AttributionQualifierActor</b>
	 */
	AttributionQualifierActor getAttributionQualifierActor(Node node);
}
