package webdata.parser.xml.lido.core.set.objectDescriptionSet;

import org.w3c.dom.Node;
import ro.webdata.parser.xml.lido.core.complex.descriptiveNoteComplexType.DescriptiveNoteComplexTypeDAO;
import ro.webdata.parser.xml.lido.core.complex.descriptiveNoteComplexType.DescriptiveNoteComplexTypeDAOImpl;

public class ObjectDescriptionSetDAOImpl implements ObjectDescriptionSetDAO {
    private DescriptiveNoteComplexTypeDAO descriptiveNoteComplexTypeDAO = new DescriptiveNoteComplexTypeDAOImpl();

    public ObjectDescriptionSet getObjectDescriptionSet(Node node) {
        return new ObjectDescriptionSet(descriptiveNoteComplexTypeDAO.getDescriptiveNoteComplexType(node));
    }
}
