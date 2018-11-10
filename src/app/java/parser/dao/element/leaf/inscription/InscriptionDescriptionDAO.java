package app.java.parser.dao.element.leaf.inscription;

import app.java.parser.model.element.leaf.inscription.InscriptionDescription;
import org.w3c.dom.Node;

public interface InscriptionDescriptionDAO {
	/**
	 *
	 * @param node <b>lido:inscriptionDescription</b> node type.
	 * @return <b>InscriptionTranscription</b>
	 */
	InscriptionDescription getInscriptionDescription(Node node);
}
