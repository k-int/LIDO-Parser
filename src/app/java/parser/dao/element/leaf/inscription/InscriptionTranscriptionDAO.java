package app.java.parser.dao.element.leaf.inscription;

import app.java.parser.model.element.leaf.inscription.InscriptionTranscription;
import org.w3c.dom.Node;

public interface InscriptionTranscriptionDAO {
	/**
	 *
	 * @param node <b>lido:inscriptionTranscription</b> node type.
	 * @return <b>InscriptionTranscription</b>
	 */
	InscriptionTranscription getInscriptionTranscription(Node node);
}
