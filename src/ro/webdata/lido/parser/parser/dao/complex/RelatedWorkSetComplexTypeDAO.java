package ro.webdata.lido.parser.parser.dao.complex;

import ro.webdata.lido.parser.parser.model.complex.RelatedWorkSetComplexType;
import org.w3c.dom.Node;

public interface RelatedWorkSetComplexTypeDAO {
	/**
	 *
	 * @param node <b>lido:relatedWorkSetComplexType</b> node type and.
	 * @return <b>RelatedWorkSetComplexType</b>
	 */
	RelatedWorkSetComplexType getRelatedWorkSetComplexType(Node node);
}
