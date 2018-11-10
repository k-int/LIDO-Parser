package app.java.parser.dao.impl.element.leaf.inscription;

import app.java.parser.dao.complex.TextComplexTypeDAO;
import app.java.parser.dao.element.leaf.inscription.InscriptionTranscriptionDAO;
import app.java.parser.dao.impl.complex.TextComplexTypeDAOImpl;
import app.java.parser.model.element.leaf.inscription.InscriptionTranscription;
import org.w3c.dom.Node;

public class InscriptionTranscriptionDAOImpl implements InscriptionTranscriptionDAO {
    private static TextComplexTypeDAO textComplexTypeDAO = new TextComplexTypeDAOImpl();

    public InscriptionTranscription getInscriptionTranscription(Node node) {
        return new InscriptionTranscription(textComplexTypeDAO.getTextComplexType(node));
    }
}
