package ro.webdata.lido.parser.parser.dao.impl.element.set;

import ro.webdata.lido.parser.parser.dao.complex.DescriptiveNoteComplexTypeDAO;
import ro.webdata.lido.parser.parser.dao.element.set.EventDescriptionSetDAO;
import ro.webdata.lido.parser.parser.dao.impl.complex.DescriptiveNoteComplexTypeDAOImpl;
import ro.webdata.lido.parser.parser.model.element.set.EventDescriptionSet;
import org.w3c.dom.Node;

public class EventDescriptionSetDAOImpl implements EventDescriptionSetDAO {
    private DescriptiveNoteComplexTypeDAO descriptiveNoteComplexTypeDAO = new DescriptiveNoteComplexTypeDAOImpl();

    public EventDescriptionSet getEventDescriptionSet(Node node) {
        return new EventDescriptionSet(descriptiveNoteComplexTypeDAO.getDescriptiveNoteComplexType(node));
    }
}
