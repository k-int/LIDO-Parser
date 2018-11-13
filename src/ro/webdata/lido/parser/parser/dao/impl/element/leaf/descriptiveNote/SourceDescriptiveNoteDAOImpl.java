package ro.webdata.lido.parser.parser.dao.impl.element.leaf.descriptiveNote;

import ro.webdata.lido.parser.parser.dao.complex.TextComplexTypeDAO;
import ro.webdata.lido.parser.parser.dao.element.leaf.descriptiveNote.SourceDescriptiveNoteDAO;
import ro.webdata.lido.parser.parser.dao.impl.complex.TextComplexTypeDAOImpl;
import ro.webdata.lido.parser.parser.model.element.leaf.descriptiveNote.SourceDescriptiveNote;
import org.w3c.dom.Node;

public class SourceDescriptiveNoteDAOImpl implements SourceDescriptiveNoteDAO {
    private static TextComplexTypeDAO textComplexTypeDAO = new TextComplexTypeDAOImpl();

    public SourceDescriptiveNote getSourceDescriptiveNote(Node node) {
        return new SourceDescriptiveNote(textComplexTypeDAO.getTextComplexType(node));
    }
}
