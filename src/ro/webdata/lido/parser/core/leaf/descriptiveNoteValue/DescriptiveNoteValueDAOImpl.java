package ro.webdata.lido.parser.core.leaf.descriptiveNoteValue;

import ro.webdata.lido.parser.core.complex.textComplexType.TextComplexTypeDAO;
import ro.webdata.lido.parser.core.complex.textComplexType.TextComplexTypeDAOImpl;
import org.w3c.dom.Node;

public class DescriptiveNoteValueDAOImpl implements DescriptiveNoteValueDAO {
    private static TextComplexTypeDAO textComplexTypeDAO = new TextComplexTypeDAOImpl();

    public DescriptiveNoteValue getDescriptiveNoteValue(Node node) {
        return new DescriptiveNoteValue(textComplexTypeDAO.getTextComplexType(node));
    }
}
