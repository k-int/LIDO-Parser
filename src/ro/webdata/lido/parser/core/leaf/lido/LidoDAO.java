package ro.webdata.lido.parser.core.leaf.lido;

import org.w3c.dom.Node;

public interface LidoDAO {
	/**
	 *
	 * @param node <b>lido:lido</b> node type.
	 * @return <b>Lido</b>
	 */
	Lido getLido(Node node);
}
