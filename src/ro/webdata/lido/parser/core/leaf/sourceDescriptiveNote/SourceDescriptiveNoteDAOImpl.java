package ro.webdata.lido.parser.core.leaf.sourceDescriptiveNote;

import ro.webdata.lido.parser.core.complex.textComplexType.TextComplexTypeDAO;
import ro.webdata.lido.parser.core.complex.textComplexType.TextComplexTypeDAOImpl;
import org.w3c.dom.Node;

public class SourceDescriptiveNoteDAOImpl implements SourceDescriptiveNoteDAO {
    private static TextComplexTypeDAO textComplexTypeDAO = new TextComplexTypeDAOImpl();

    public SourceDescriptiveNote getSourceDescriptiveNote(Node node) {
        return new SourceDescriptiveNote(textComplexTypeDAO.getTextComplexType(node));
    }
}
