package ro.webdata.lido.parser.parser.dao.complex;

import ro.webdata.lido.parser.parser.model.complex.RepositorySetComplexType;
import org.w3c.dom.Node;

public interface RepositorySetComplexTypeDAO {
	/**
	 *
	 * @param node <b>lido:repositorySetComplexType</b> node type.
	 * @return <b>RepositorySetComplexType</b>
	 */
	RepositorySetComplexType getRepositorySetComplexType(Node node);
}