package app.java.parser.dao.element.leaf.work;

import app.java.parser.model.element.leaf.work.RelatedWorkRelType;
import org.w3c.dom.Node;

public interface RelatedWorkRelTypeDAO {
	/**
	 *
	 * @param node <b>lido:relatedWorkRelType</b> node type.
	 * @return <b>RelatedWorkRelType</b>
	 */
	RelatedWorkRelType getRelatedWorkRelType(Node node);
}
