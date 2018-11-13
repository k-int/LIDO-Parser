package ro.webdata.lido.parser.parser.dao;

import org.w3c.dom.Node;
import ro.webdata.lido.parser.parser.model.element.LidoWrap;

public interface LidoWrapDAO {
	/**
	 *
	 * @param node <b>lido:lidoWrap</b> node type.
	 * @return <b>LidoWrap</b>
	 */
	LidoWrap getLidoWrap(Node node);
}
