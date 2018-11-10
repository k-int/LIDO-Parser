package app.java.parser.dao.element.leaf;

import org.w3c.dom.Node;

import app.java.parser.model.element.leaf.Category;
import app.java.parser.dao.complex.ConceptComplexTypeDAO;

public interface CategoryDAO {
	/**
	 *
	 * @param node <b>lido:category</b> node type.
	 * @return <b>Category</b>
	 */
	Category getCategory(Node node);
}
