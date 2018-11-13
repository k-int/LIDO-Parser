package ro.webdata.lido.parser.parser.dao.element.leaf.inscription;

import ro.webdata.lido.parser.parser.model.element.leaf.inscription.InscriptionTranscription;
import org.w3c.dom.Node;

public interface InscriptionTranscriptionDAO {
	/**
	 *
	 * @param node <b>lido:inscriptionTranscription</b> node type.
	 * @return <b>InscriptionTranscription</b>
	 */
	InscriptionTranscription getInscriptionTranscription(Node node);
}
