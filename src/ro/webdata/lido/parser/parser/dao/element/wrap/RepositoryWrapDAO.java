package ro.webdata.lido.parser.parser.dao.element.wrap;

import ro.webdata.lido.parser.parser.model.element.wrap.RepositoryWrap;
import org.w3c.dom.Node;

public interface RepositoryWrapDAO {
	/**
	 *
	 * @param node <b>lido:repositoryWrap</b> node type.
	 * @return <b>RepositoryWrap</b>
	 */
	RepositoryWrap getRepositoryWrap(Node node);
}
