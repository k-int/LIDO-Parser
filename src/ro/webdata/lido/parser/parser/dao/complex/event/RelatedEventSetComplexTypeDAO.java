package ro.webdata.lido.parser.parser.dao.complex.event;

import ro.webdata.lido.parser.parser.model.complex.event.RelatedEventSetComplexType;
import org.w3c.dom.Node;

public interface RelatedEventSetComplexTypeDAO {
	/**
	 *
	 * @param node <b>lido:relatedEventSetComplexType</b> node type and.
	 * @return <b>RelatedEventSetComplexType</b>
	 */
	RelatedEventSetComplexType getRelatedEventSetComplexType(Node node);
}
