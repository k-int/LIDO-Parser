package ro.webdata.lido.parser.parser.dao.impl.element.set;

import ro.webdata.lido.parser.parser.dao.complex.DescriptiveNoteComplexTypeDAO;
import ro.webdata.lido.parser.parser.dao.element.set.ObjectDescriptionSetDAO;
import ro.webdata.lido.parser.parser.dao.impl.complex.DescriptiveNoteComplexTypeDAOImpl;
import ro.webdata.lido.parser.parser.model.element.set.ObjectDescriptionSet;
import org.w3c.dom.Node;

public class ObjectDescriptionSetDAOImpl implements ObjectDescriptionSetDAO {
    private DescriptiveNoteComplexTypeDAO descriptiveNoteComplexTypeDAO = new DescriptiveNoteComplexTypeDAOImpl();

    public ObjectDescriptionSet getObjectDescriptionSet(Node node) {
        return new ObjectDescriptionSet(descriptiveNoteComplexTypeDAO.getDescriptiveNoteComplexType(node));
    }
}
