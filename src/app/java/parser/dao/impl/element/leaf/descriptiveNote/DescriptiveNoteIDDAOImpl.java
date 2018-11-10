package app.java.parser.dao.impl.element.leaf.descriptiveNote;

import app.java.parser.dao.complex.IdentifierComplexTypeDAO;
import app.java.parser.dao.element.leaf.descriptiveNote.DescriptiveNoteIDDAO;
import app.java.parser.dao.impl.complex.IdentifierComplexTypeDAOImpl;
import app.java.parser.model.element.leaf.descriptiveNote.DescriptiveNoteID;
import org.w3c.dom.Node;

public class DescriptiveNoteIDDAOImpl implements DescriptiveNoteIDDAO {
    private static IdentifierComplexTypeDAO identifierComplexTypeDAO = new IdentifierComplexTypeDAOImpl();

    public DescriptiveNoteID getDescriptiveNoteID(Node node) {
        return new DescriptiveNoteID(identifierComplexTypeDAO.getIdentifierComplexType(node));
    }
}
