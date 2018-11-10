package app.java.parser.dao.element.leaf.repository;

import app.java.parser.model.element.leaf.repository.RepositoryName;
import org.w3c.dom.Node;

public interface RepositoryNameDAO {
	/**
	 *
	 * @param node <b>lido:repositoryName</b> node type.
	 * @return <b>RepositoryName</b>
	 */
	RepositoryName getRepositoryName(Node node);
}
