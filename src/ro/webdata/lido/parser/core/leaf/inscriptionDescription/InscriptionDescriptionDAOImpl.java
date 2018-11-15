package ro.webdata.lido.parser.core.leaf.inscriptionDescription;

import ro.webdata.lido.parser.core.complex.descriptiveNoteComplexType.DescriptiveNoteComplexTypeDAO;
import ro.webdata.lido.parser.core.complex.descriptiveNoteComplexType.DescriptiveNoteComplexTypeDAOImpl;
import org.w3c.dom.Node;

public class InscriptionDescriptionDAOImpl implements InscriptionDescriptionDAO {
    private static DescriptiveNoteComplexTypeDAO descriptiveNoteComplexTypeDAO = new DescriptiveNoteComplexTypeDAOImpl();

    public InscriptionDescription getInscriptionDescription(Node node) {
        return new InscriptionDescription(descriptiveNoteComplexTypeDAO.getDescriptiveNoteComplexType(node));
    }
}
