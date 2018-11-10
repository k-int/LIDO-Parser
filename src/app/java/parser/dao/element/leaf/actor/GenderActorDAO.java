package app.java.parser.dao.element.leaf.actor;

import app.java.parser.model.element.leaf.actor.GenderActor;
import org.w3c.dom.Node;

public interface GenderActorDAO {
	/**
	 *
	 * @param node <b>lido:genderActor</b> node type.
	 * @return <b>GenderActor</b>
	 */
	GenderActor getGenderActor(Node node);
}
