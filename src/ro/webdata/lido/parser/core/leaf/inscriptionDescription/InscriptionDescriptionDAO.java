package ro.webdata.lido.parser.core.leaf.inscriptionDescription;

import org.w3c.dom.Node;

public interface InscriptionDescriptionDAO {
	/**
	 *
	 * @param node <b>lido:inscriptionDescription</b> node type.
	 * @return <b>InscriptionTranscription</b>
	 */
	InscriptionDescription getInscriptionDescription(Node node);
}
