package ro.webdata.lido.parser.core.leaf.sourceStateEdition;

import ro.webdata.lido.parser.core.complex.textComplexType.TextComplexTypeDAO;
import ro.webdata.lido.parser.core.complex.textComplexType.TextComplexTypeDAOImpl;
import org.w3c.dom.Node;

public class SourceStateEditionDAOImpl implements SourceStateEditionDAO {
    private static TextComplexTypeDAO textComplexTypeDAO = new TextComplexTypeDAOImpl();

    public SourceStateEdition getSourceStateEdition(Node node) {
        return new SourceStateEdition(textComplexTypeDAO.getTextComplexType(node));
    }
}
