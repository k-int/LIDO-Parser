package ro.webdata.lido.parser.core.leaf.category;

import org.w3c.dom.Node;

public interface CategoryDAO {
	/**
	 *
	 * @param node <b>lido:category</b> node type.
	 * @return <b>Category</b>
	 */
	Category getCategory(Node node);
}
