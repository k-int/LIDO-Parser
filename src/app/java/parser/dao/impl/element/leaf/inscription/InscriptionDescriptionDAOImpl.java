package app.java.parser.dao.impl.element.leaf.inscription;

import app.java.parser.dao.complex.DescriptiveNoteComplexTypeDAO;
import app.java.parser.dao.element.leaf.inscription.InscriptionDescriptionDAO;
import app.java.parser.dao.impl.complex.DescriptiveNoteComplexTypeDAOImpl;
import app.java.parser.model.element.leaf.inscription.InscriptionDescription;
import org.w3c.dom.Node;

public class InscriptionDescriptionDAOImpl implements InscriptionDescriptionDAO {
    private static DescriptiveNoteComplexTypeDAO descriptiveNoteComplexTypeDAO = new DescriptiveNoteComplexTypeDAOImpl();

    public InscriptionDescription getInscriptionDescription(Node node) {
        return new InscriptionDescription(descriptiveNoteComplexTypeDAO.getDescriptiveNoteComplexType(node));
    }
}
