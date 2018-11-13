package ro.webdata.lido.parser.parser.dao.element.leaf;

import ro.webdata.lido.parser.parser.model.element.leaf.LidoRecID;
import org.w3c.dom.Node;

public interface LidoRecIDDAO {
	/**
	 *
	 * @param node <b>lido:lidoRecID</b> node type.
	 * @return <b>LidoRecID</b>
	 */
	LidoRecID getLidoRecID(Node node);
}
