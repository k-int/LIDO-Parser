package app.java.parser.dao.element.leaf.repository;

import app.java.parser.model.element.leaf.repository.RepositoryLocation;
import org.w3c.dom.Node;

public interface RepositoryLocationDAO {
	/**
	 *
	 * @param node <b>lido:repositoryLocation</b> node type.
	 * @return <b>RepositoryLocation</b>
	 */
	RepositoryLocation getRepositoryLocation(Node node);
}
