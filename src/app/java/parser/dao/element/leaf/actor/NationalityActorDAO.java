package app.java.parser.dao.element.leaf.actor;

import app.java.parser.model.element.leaf.actor.NationalityActor;
import org.w3c.dom.Node;

public interface NationalityActorDAO {
	/**
	 *
	 * @param node <b>lido:nationalityActor</b> node type.
	 * @return <b>NationalityActor</b>
	 */
	NationalityActor getNationalityActor(Node node);
}
