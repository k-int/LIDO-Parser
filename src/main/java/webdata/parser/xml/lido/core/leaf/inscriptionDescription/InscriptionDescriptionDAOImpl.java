package webdata.parser.xml.lido.core.leaf.inscriptionDescription;

import org.w3c.dom.Node;
import ro.webdata.parser.xml.lido.core.complex.descriptiveNoteComplexType.DescriptiveNoteComplexTypeDAO;
import ro.webdata.parser.xml.lido.core.complex.descriptiveNoteComplexType.DescriptiveNoteComplexTypeDAOImpl;

public class InscriptionDescriptionDAOImpl implements InscriptionDescriptionDAO {
    private static DescriptiveNoteComplexTypeDAO descriptiveNoteComplexTypeDAO = new DescriptiveNoteComplexTypeDAOImpl();

    public InscriptionDescription getInscriptionDescription(Node node) {
        return new InscriptionDescription(descriptiveNoteComplexTypeDAO.getDescriptiveNoteComplexType(node));
    }
}
