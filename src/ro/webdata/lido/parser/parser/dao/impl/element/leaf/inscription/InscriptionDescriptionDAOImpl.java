package ro.webdata.lido.parser.parser.dao.impl.element.leaf.inscription;

import ro.webdata.lido.parser.parser.dao.complex.DescriptiveNoteComplexTypeDAO;
import ro.webdata.lido.parser.parser.dao.element.leaf.inscription.InscriptionDescriptionDAO;
import ro.webdata.lido.parser.parser.dao.impl.complex.DescriptiveNoteComplexTypeDAOImpl;
import ro.webdata.lido.parser.parser.model.element.leaf.inscription.InscriptionDescription;
import org.w3c.dom.Node;

public class InscriptionDescriptionDAOImpl implements InscriptionDescriptionDAO {
    private static DescriptiveNoteComplexTypeDAO descriptiveNoteComplexTypeDAO = new DescriptiveNoteComplexTypeDAOImpl();

    public InscriptionDescription getInscriptionDescription(Node node) {
        return new InscriptionDescription(descriptiveNoteComplexTypeDAO.getDescriptiveNoteComplexType(node));
    }
}
