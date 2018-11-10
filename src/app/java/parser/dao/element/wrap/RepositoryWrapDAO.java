package app.java.parser.dao.element.wrap;

import app.java.parser.model.element.wrap.RepositoryWrap;
import org.w3c.dom.Node;

public interface RepositoryWrapDAO {
	/**
	 *
	 * @param node <b>lido:repositoryWrap</b> node type.
	 * @return <b>RepositoryWrap</b>
	 */
	RepositoryWrap getRepositoryWrap(Node node);
}
