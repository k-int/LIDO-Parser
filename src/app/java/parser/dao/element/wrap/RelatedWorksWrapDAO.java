package app.java.parser.dao.element.wrap;

import app.java.parser.model.element.wrap.RelatedWorksWrap;
import org.w3c.dom.Node;

public interface RelatedWorksWrapDAO {
	/**
	 *
	 * @param node <b>lido:relatedWorksWrap</b> node type.
	 * @return <b>RelatedWorksWrap</b>
	 */
	RelatedWorksWrap getRelatedWorksWrap(Node node);
}
