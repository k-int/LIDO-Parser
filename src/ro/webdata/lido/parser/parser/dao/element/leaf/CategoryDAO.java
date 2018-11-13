package ro.webdata.lido.parser.parser.dao.element.leaf;

import org.w3c.dom.Node;

import ro.webdata.lido.parser.parser.model.element.leaf.Category;

public interface CategoryDAO {
	/**
	 *
	 * @param node <b>lido:category</b> node type.
	 * @return <b>Category</b>
	 */
	Category getCategory(Node node);
}
