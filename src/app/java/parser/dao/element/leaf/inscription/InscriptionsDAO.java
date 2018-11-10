package app.java.parser.dao.element.leaf.inscription;

import app.java.parser.model.element.leaf.inscription.Inscriptions;
import org.w3c.dom.Node;

public interface InscriptionsDAO {
	/**
	 *
	 * @param node <b>lido:inscriptions</b> node type.
	 * @return <b>Inscriptions</b>
	 */
	Inscriptions getInscriptions(Node node);
}
