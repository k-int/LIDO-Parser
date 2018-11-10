package app.java.parser.dao.impl.element.set;

import app.java.parser.dao.complex.DescriptiveNoteComplexTypeDAO;
import app.java.parser.dao.element.set.ObjectDescriptionSetDAO;
import app.java.parser.dao.impl.complex.DescriptiveNoteComplexTypeDAOImpl;
import app.java.parser.model.element.set.ObjectDescriptionSet;
import org.w3c.dom.Node;

public class ObjectDescriptionSetDAOImpl implements ObjectDescriptionSetDAO {
    private DescriptiveNoteComplexTypeDAO descriptiveNoteComplexTypeDAO = new DescriptiveNoteComplexTypeDAOImpl();

    public ObjectDescriptionSet getObjectDescriptionSet(Node node) {
        return new ObjectDescriptionSet(descriptiveNoteComplexTypeDAO.getDescriptiveNoteComplexType(node));
    }
}
