package ro.webdata.lido.parser.core.set.objectDescriptionSet;

import ro.webdata.lido.parser.core.complex.descriptiveNoteComplexType.DescriptiveNoteComplexTypeDAO;
import ro.webdata.lido.parser.core.complex.descriptiveNoteComplexType.DescriptiveNoteComplexTypeDAOImpl;
import org.w3c.dom.Node;

public class ObjectDescriptionSetDAOImpl implements ObjectDescriptionSetDAO {
    private DescriptiveNoteComplexTypeDAO descriptiveNoteComplexTypeDAO = new DescriptiveNoteComplexTypeDAOImpl();

    public ObjectDescriptionSet getObjectDescriptionSet(Node node) {
        return new ObjectDescriptionSet(descriptiveNoteComplexTypeDAO.getDescriptiveNoteComplexType(node));
    }
}
