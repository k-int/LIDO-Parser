package ro.webdata.lido.parser.core.leaf.inscriptionTranscription;

import ro.webdata.lido.parser.core.complex.textComplexType.TextComplexTypeDAO;
import ro.webdata.lido.parser.core.complex.textComplexType.TextComplexTypeDAOImpl;
import org.w3c.dom.Node;

public class InscriptionTranscriptionDAOImpl implements InscriptionTranscriptionDAO {
    private static TextComplexTypeDAO textComplexTypeDAO = new TextComplexTypeDAOImpl();

    public InscriptionTranscription getInscriptionTranscription(Node node) {
        return new InscriptionTranscription(textComplexTypeDAO.getTextComplexType(node));
    }
}
