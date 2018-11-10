package app.java.parser.dao.impl.element.leaf.descriptiveNote;

import app.java.parser.dao.complex.TextComplexTypeDAO;
import app.java.parser.dao.element.leaf.descriptiveNote.SourceDescriptiveNoteDAO;
import app.java.parser.dao.impl.complex.TextComplexTypeDAOImpl;
import app.java.parser.model.element.leaf.descriptiveNote.SourceDescriptiveNote;
import org.w3c.dom.Node;

public class SourceDescriptiveNoteDAOImpl implements SourceDescriptiveNoteDAO {
    private static TextComplexTypeDAO textComplexTypeDAO = new TextComplexTypeDAOImpl();

    public SourceDescriptiveNote getSourceDescriptiveNote(Node node) {
        return new SourceDescriptiveNote(textComplexTypeDAO.getTextComplexType(node));
    }
}
