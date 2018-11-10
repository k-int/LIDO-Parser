package app.java.parser.dao.impl.element.leaf.descriptiveNote;

import app.java.parser.dao.complex.TextComplexTypeDAO;
import app.java.parser.dao.element.leaf.descriptiveNote.DescriptiveNoteValueDAO;
import app.java.parser.dao.impl.complex.TextComplexTypeDAOImpl;
import app.java.parser.model.element.leaf.descriptiveNote.DescriptiveNoteValue;
import org.w3c.dom.Node;

public class DescriptiveNoteValueDAOImpl implements DescriptiveNoteValueDAO {
    private static TextComplexTypeDAO textComplexTypeDAO = new TextComplexTypeDAOImpl();

    public DescriptiveNoteValue getDescriptiveNoteValue(Node node) {
        return new DescriptiveNoteValue(textComplexTypeDAO.getTextComplexType(node));
    }
}
