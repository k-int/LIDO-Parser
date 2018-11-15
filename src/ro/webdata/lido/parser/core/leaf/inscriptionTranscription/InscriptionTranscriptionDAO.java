package ro.webdata.lido.parser.core.leaf.inscriptionTranscription;

import org.w3c.dom.Node;

public interface InscriptionTranscriptionDAO {
	/**
	 *
	 * @param node <b>lido:inscriptionTranscription</b> node type.
	 * @return <b>InscriptionTranscription</b>
	 */
	InscriptionTranscription getInscriptionTranscription(Node node);
}
