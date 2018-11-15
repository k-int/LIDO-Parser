package ro.webdata.lido.parser.core.set.repositorySet;

import org.w3c.dom.Node;

public interface RepositorySetDAO {
	/**
	 *
	 * @param node <b>lido:repositorySet</b> node type.
	 * @return <b>RepositorySet</b>
	 */
	RepositorySet getRepositorySet(Node node);
}
