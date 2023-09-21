package webdata.parser.xml.lido.core.set.eventDescriptionSet;

import org.w3c.dom.Node;
import ro.webdata.parser.xml.lido.core.complex.descriptiveNoteComplexType.DescriptiveNoteComplexTypeDAO;
import ro.webdata.parser.xml.lido.core.complex.descriptiveNoteComplexType.DescriptiveNoteComplexTypeDAOImpl;

public class EventDescriptionSetDAOImpl implements EventDescriptionSetDAO {
    private DescriptiveNoteComplexTypeDAO descriptiveNoteComplexTypeDAO = new DescriptiveNoteComplexTypeDAOImpl();

    public EventDescriptionSet getEventDescriptionSet(Node node) {
        return new EventDescriptionSet(descriptiveNoteComplexTypeDAO.getDescriptiveNoteComplexType(node));
    }
}
