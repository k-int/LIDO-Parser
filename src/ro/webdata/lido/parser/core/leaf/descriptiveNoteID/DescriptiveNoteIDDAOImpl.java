package ro.webdata.lido.parser.core.leaf.descriptiveNoteID;

import ro.webdata.lido.parser.core.complex.identifierComplexType.IdentifierComplexTypeDAO;
import ro.webdata.lido.parser.core.complex.identifierComplexType.IdentifierComplexTypeDAOImpl;
import org.w3c.dom.Node;

public class DescriptiveNoteIDDAOImpl implements DescriptiveNoteIDDAO {
    private static IdentifierComplexTypeDAO identifierComplexTypeDAO = new IdentifierComplexTypeDAOImpl();

    public DescriptiveNoteID getDescriptiveNoteID(Node node) {
        return new DescriptiveNoteID(identifierComplexTypeDAO.getIdentifierComplexType(node));
    }
}
