package webdata.parser.xml.lido.core.leaf.inscriptionTranscription;

import org.w3c.dom.Node;
import ro.webdata.parser.xml.lido.core.complex.textComplexType.TextComplexTypeDAO;
import ro.webdata.parser.xml.lido.core.complex.textComplexType.TextComplexTypeDAOImpl;

public class InscriptionTranscriptionDAOImpl implements InscriptionTranscriptionDAO {
    private static TextComplexTypeDAO textComplexTypeDAO = new TextComplexTypeDAOImpl();

    public InscriptionTranscription getInscriptionTranscription(Node node) {
        return new InscriptionTranscription(textComplexTypeDAO.getTextComplexType(node));
    }
}
