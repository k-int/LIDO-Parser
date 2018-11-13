package ro.webdata.lido.parser.parser.dao.element.leaf.inscription;

import ro.webdata.lido.parser.parser.model.element.leaf.inscription.InscriptionDescription;
import org.w3c.dom.Node;

public interface InscriptionDescriptionDAO {
	/**
	 *
	 * @param node <b>lido:inscriptionDescription</b> node type.
	 * @return <b>InscriptionTranscription</b>
	 */
	InscriptionDescription getInscriptionDescription(Node node);
}
