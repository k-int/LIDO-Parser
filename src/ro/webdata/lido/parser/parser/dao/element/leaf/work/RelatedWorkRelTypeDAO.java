package ro.webdata.lido.parser.parser.dao.element.leaf.work;

import ro.webdata.lido.parser.parser.model.element.leaf.work.RelatedWorkRelType;
import org.w3c.dom.Node;

public interface RelatedWorkRelTypeDAO {
	/**
	 *
	 * @param node <b>lido:relatedWorkRelType</b> node type.
	 * @return <b>RelatedWorkRelType</b>
	 */
	RelatedWorkRelType getRelatedWorkRelType(Node node);
}
