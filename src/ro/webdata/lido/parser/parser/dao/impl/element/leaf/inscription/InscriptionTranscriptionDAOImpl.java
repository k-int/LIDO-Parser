package ro.webdata.lido.parser.parser.dao.impl.element.leaf.inscription;

import ro.webdata.lido.parser.parser.dao.complex.TextComplexTypeDAO;
import ro.webdata.lido.parser.parser.dao.element.leaf.inscription.InscriptionTranscriptionDAO;
import ro.webdata.lido.parser.parser.dao.impl.complex.TextComplexTypeDAOImpl;
import ro.webdata.lido.parser.parser.model.element.leaf.inscription.InscriptionTranscription;
import org.w3c.dom.Node;

public class InscriptionTranscriptionDAOImpl implements InscriptionTranscriptionDAO {
    private static TextComplexTypeDAO textComplexTypeDAO = new TextComplexTypeDAOImpl();

    public InscriptionTranscription getInscriptionTranscription(Node node) {
        return new InscriptionTranscription(textComplexTypeDAO.getTextComplexType(node));
    }
}
