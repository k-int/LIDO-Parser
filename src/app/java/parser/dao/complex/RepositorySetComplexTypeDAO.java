package app.java.parser.dao.complex;

import app.java.parser.model.complex.RepositorySetComplexType;
import org.w3c.dom.Node;

public interface RepositorySetComplexTypeDAO {
	/**
	 *
	 * @param node <b>lido:repositorySetComplexType</b> node type.
	 * @return <b>RepositorySetComplexType</b>
	 */
	RepositorySetComplexType getRepositorySetComplexType(Node node);
}
