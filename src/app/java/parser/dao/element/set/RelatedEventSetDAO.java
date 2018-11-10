package app.java.parser.dao.element.set;

import app.java.parser.model.element.set.RelatedEventSet;
import org.w3c.dom.Node;

public interface RelatedEventSetDAO {
	/**
	 *
	 * @param node <b>lido:relatedEventSet</b> node type.
	 * @return <b>RelatedEventSet</b>
	 */
	RelatedEventSet getRelatedEventSet(Node node);
}
