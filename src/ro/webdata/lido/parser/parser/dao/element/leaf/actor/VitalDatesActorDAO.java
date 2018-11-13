package ro.webdata.lido.parser.parser.dao.element.leaf.actor;

import ro.webdata.lido.parser.parser.model.element.leaf.actor.VitalDatesActor;
import org.w3c.dom.Node;

public interface VitalDatesActorDAO {
	/**
	 *
	 * @param node <b>lido:vitalDatesActor</b> node type.
	 * @return <b>VitalDatesActor</b>
	 */
	VitalDatesActor getVitalDatesActor(Node node);
}
