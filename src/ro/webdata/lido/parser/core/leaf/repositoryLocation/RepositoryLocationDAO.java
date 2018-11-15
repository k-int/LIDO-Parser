package ro.webdata.lido.parser.core.leaf.repositoryLocation;

import org.w3c.dom.Node;

public interface RepositoryLocationDAO {
	/**
	 *
	 * @param node <b>lido:repositoryLocation</b> node type.
	 * @return <b>RepositoryLocation</b>
	 */
	RepositoryLocation getRepositoryLocation(Node node);
}
