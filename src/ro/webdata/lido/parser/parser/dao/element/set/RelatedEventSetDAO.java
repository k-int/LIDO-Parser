package ro.webdata.lido.parser.parser.dao.element.set;

import ro.webdata.lido.parser.parser.model.element.set.RelatedEventSet;
import org.w3c.dom.Node;

public interface RelatedEventSetDAO {
	/**
	 *
	 * @param node <b>lido:relatedEventSet</b> node type.
	 * @return <b>RelatedEventSet</b>
	 */
	RelatedEventSet getRelatedEventSet(Node node);
}
