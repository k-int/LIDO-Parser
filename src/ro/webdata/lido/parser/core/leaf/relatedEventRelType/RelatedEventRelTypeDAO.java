package ro.webdata.lido.parser.core.leaf.relatedEventRelType;

import org.w3c.dom.Node;

public interface RelatedEventRelTypeDAO {
	/**
	 *
	 * @param node <b>lido:relatedEventRelType</b> node type.
	 * @return <b>RelatedEventRelType</b>
	 */
	RelatedEventRelType getRelatedEventRelType(Node node);
}
