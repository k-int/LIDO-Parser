package app.java.parser.dao.element.set;

import app.java.parser.model.element.set.RepositorySet;
import org.w3c.dom.Node;

public interface RepositorySetDAO {
	/**
	 *
	 * @param node <b>lido:repositorySet</b> node type.
	 * @return <b>RepositorySet</b>
	 */
	RepositorySet getRepositorySet(Node node);
}
