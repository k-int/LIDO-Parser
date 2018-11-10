package app.java.parser.dao.element.leaf.work;

import app.java.parser.model.element.leaf.work.RelatedWork;
import org.w3c.dom.Node;

public interface RelatedWorkDAO {
	/**
	 *
	 * @param node <b>lido:relatedWork</b> node type.
	 * @return <b>RelatedWork</b>
	 */
	RelatedWork getRelatedWork(Node node);
}
