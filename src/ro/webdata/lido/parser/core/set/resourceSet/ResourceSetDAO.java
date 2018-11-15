package ro.webdata.lido.parser.core.set.resourceSet;

import org.w3c.dom.Node;

public interface ResourceSetDAO {
	/**
	 *
	 * @param node <b>lido:resourceSet</b> node type.
	 * @return <b>ResourceSet</b>
	 */
	ResourceSet getResourceSet(Node node);
}
