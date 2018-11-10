package app.java.parser.dao.element.set;

import app.java.parser.model.element.set.NameActorSet;
import org.w3c.dom.Node;

public interface NameActorSetDAO {
	/**
	 *
	 * @param node <b>lido:nationalityActor</b> node type.
	 * @return <b>NameActorSet</b>
	 */
	NameActorSet getNameActorSet(Node node);
}
