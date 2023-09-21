package webdata.parser.xml.lido.core.leaf.sourceDescriptiveNote;

import org.w3c.dom.Node;
import ro.webdata.parser.xml.lido.core.complex.textComplexType.TextComplexTypeDAO;
import ro.webdata.parser.xml.lido.core.complex.textComplexType.TextComplexTypeDAOImpl;

public class SourceDescriptiveNoteDAOImpl implements SourceDescriptiveNoteDAO {
    private static TextComplexTypeDAO textComplexTypeDAO = new TextComplexTypeDAOImpl();

    public SourceDescriptiveNote getSourceDescriptiveNote(Node node) {
        return new SourceDescriptiveNote(textComplexTypeDAO.getTextComplexType(node));
    }
}
