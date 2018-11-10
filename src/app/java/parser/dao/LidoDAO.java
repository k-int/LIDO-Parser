package app.java.parser.dao;

import app.java.parser.model.element.Lido;
import org.w3c.dom.Node;

public interface LidoDAO {
	/**
	 *
	 * @param node <b>lido:lido</b> node type.
	 * @return <b>Lido</b>
	 */
	Lido getLido(Node node);
}
