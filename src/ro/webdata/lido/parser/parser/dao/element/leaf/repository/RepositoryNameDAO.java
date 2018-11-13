package ro.webdata.lido.parser.parser.dao.element.leaf.repository;

import ro.webdata.lido.parser.parser.model.element.leaf.repository.RepositoryName;
import org.w3c.dom.Node;

public interface RepositoryNameDAO {
	/**
	 *
	 * @param node <b>lido:repositoryName</b> node type.
	 * @return <b>RepositoryName</b>
	 */
	RepositoryName getRepositoryName(Node node);
}
