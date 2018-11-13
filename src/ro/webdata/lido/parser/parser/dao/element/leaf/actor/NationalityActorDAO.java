package ro.webdata.lido.parser.parser.dao.element.leaf.actor;

import ro.webdata.lido.parser.parser.model.element.leaf.actor.NationalityActor;
import org.w3c.dom.Node;

public interface NationalityActorDAO {
	/**
	 *
	 * @param node <b>lido:nationalityActor</b> node type.
	 * @return <b>NationalityActor</b>
	 */
	NationalityActor getNationalityActor(Node node);
}
