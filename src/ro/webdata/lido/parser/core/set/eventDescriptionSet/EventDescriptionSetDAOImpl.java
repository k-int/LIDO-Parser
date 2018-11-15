package ro.webdata.lido.parser.core.set.eventDescriptionSet;

import ro.webdata.lido.parser.core.complex.descriptiveNoteComplexType.DescriptiveNoteComplexTypeDAO;
import ro.webdata.lido.parser.core.complex.descriptiveNoteComplexType.DescriptiveNoteComplexTypeDAOImpl;
import org.w3c.dom.Node;

public class EventDescriptionSetDAOImpl implements EventDescriptionSetDAO {
    private DescriptiveNoteComplexTypeDAO descriptiveNoteComplexTypeDAO = new DescriptiveNoteComplexTypeDAOImpl();

    public EventDescriptionSet getEventDescriptionSet(Node node) {
        return new EventDescriptionSet(descriptiveNoteComplexTypeDAO.getDescriptiveNoteComplexType(node));
    }
}
