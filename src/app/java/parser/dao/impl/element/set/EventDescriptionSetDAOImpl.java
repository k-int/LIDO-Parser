package app.java.parser.dao.impl.element.set;

import app.java.parser.dao.complex.DescriptiveNoteComplexTypeDAO;
import app.java.parser.dao.element.set.EventDescriptionSetDAO;
import app.java.parser.dao.impl.complex.DescriptiveNoteComplexTypeDAOImpl;
import app.java.parser.model.element.set.EventDescriptionSet;
import org.w3c.dom.Node;

public class EventDescriptionSetDAOImpl implements EventDescriptionSetDAO {
    private DescriptiveNoteComplexTypeDAO descriptiveNoteComplexTypeDAO = new DescriptiveNoteComplexTypeDAOImpl();

    public EventDescriptionSet getEventDescriptionSet(Node node) {
        return new EventDescriptionSet(descriptiveNoteComplexTypeDAO.getDescriptiveNoteComplexType(node));
    }
}
