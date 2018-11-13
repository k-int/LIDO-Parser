package ro.webdata.lido.parser.parser.dao.element.leaf;

import ro.webdata.lido.parser.parser.model.element.leaf.Classification;
import org.w3c.dom.Node;

public interface ClassificationDAO {
	/**
	 *
	 * @param node <b>lido:classification</b> node type.
	 * @return <b>Classification</b>
	 */
	Classification getClassification(Node node);
}
