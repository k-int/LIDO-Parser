package app.java.parser.dao.element.leaf;

import app.java.parser.model.element.leaf.Classification;
import org.w3c.dom.Node;

public interface ClassificationDAO {
	/**
	 *
	 * @param node <b>lido:classification</b> node type.
	 * @return <b>Classification</b>
	 */
	Classification getClassification(Node node);
}
