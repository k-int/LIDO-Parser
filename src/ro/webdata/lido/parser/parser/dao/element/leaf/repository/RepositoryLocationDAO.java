package ro.webdata.lido.parser.parser.dao.element.leaf.repository;

import ro.webdata.lido.parser.parser.model.element.leaf.repository.RepositoryLocation;
import org.w3c.dom.Node;

public interface RepositoryLocationDAO {
	/**
	 *
	 * @param node <b>lido:repositoryLocation</b> node type.
	 * @return <b>RepositoryLocation</b>
	 */
	RepositoryLocation getRepositoryLocation(Node node);
}
