package webdata.parser.xml.lido.core.leaf.sourceStateEdition;

import org.w3c.dom.Node;
import ro.webdata.parser.xml.lido.core.complex.textComplexType.TextComplexTypeDAO;
import ro.webdata.parser.xml.lido.core.complex.textComplexType.TextComplexTypeDAOImpl;

public class SourceStateEditionDAOImpl implements SourceStateEditionDAO {
    private static TextComplexTypeDAO textComplexTypeDAO = new TextComplexTypeDAOImpl();

    public SourceStateEdition getSourceStateEdition(Node node) {
        return new SourceStateEdition(textComplexTypeDAO.getTextComplexType(node));
    }
}
