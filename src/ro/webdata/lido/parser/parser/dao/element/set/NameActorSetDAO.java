package ro.webdata.lido.parser.parser.dao.element.set;

import ro.webdata.lido.parser.parser.model.element.set.NameActorSet;
import org.w3c.dom.Node;

public interface NameActorSetDAO {
	/**
	 *
	 * @param node <b>lido:nationalityActor</b> node type.
	 * @return <b>NameActorSet</b>
	 */
	NameActorSet getNameActorSet(Node node);
}
