package ro.webdata.lido.parser.parser.dao.element.set;

import ro.webdata.lido.parser.parser.model.element.set.ResourceSet;
import org.w3c.dom.Node;

public interface ResourceSetDAO {
	/**
	 *
	 * @param node <b>lido:resourceSet</b> node type.
	 * @return <b>ResourceSet</b>
	 */
	ResourceSet getResourceSet(Node node);
}
