package app.java.parser.dao.element.set;

import app.java.parser.model.element.set.ResourceSet;
import org.w3c.dom.Node;

public interface ResourceSetDAO {
	/**
	 *
	 * @param node <b>lido:resourceSet</b> node type.
	 * @return <b>ResourceSet</b>
	 */
	ResourceSet getResourceSet(Node node);
}
