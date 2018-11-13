package ro.webdata.lido.parser.parser.dao.impl.element.leaf.descriptiveNote;

import ro.webdata.lido.parser.parser.dao.complex.IdentifierComplexTypeDAO;
import ro.webdata.lido.parser.parser.dao.element.leaf.descriptiveNote.DescriptiveNoteIDDAO;
import ro.webdata.lido.parser.parser.dao.impl.complex.IdentifierComplexTypeDAOImpl;
import ro.webdata.lido.parser.parser.model.element.leaf.descriptiveNote.DescriptiveNoteID;
import org.w3c.dom.Node;

public class DescriptiveNoteIDDAOImpl implements DescriptiveNoteIDDAO {
    private static IdentifierComplexTypeDAO identifierComplexTypeDAO = new IdentifierComplexTypeDAOImpl();

    public DescriptiveNoteID getDescriptiveNoteID(Node node) {
        return new DescriptiveNoteID(identifierComplexTypeDAO.getIdentifierComplexType(node));
    }
}
