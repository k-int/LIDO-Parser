package ro.webdata.lido.parser.parser.dao.element.leaf.work;

import ro.webdata.lido.parser.parser.model.element.leaf.work.RelatedWork;
import org.w3c.dom.Node;

public interface RelatedWorkDAO {
	/**
	 *
	 * @param node <b>lido:relatedWork</b> node type.
	 * @return <b>RelatedWork</b>
	 */
	RelatedWork getRelatedWork(Node node);
}
