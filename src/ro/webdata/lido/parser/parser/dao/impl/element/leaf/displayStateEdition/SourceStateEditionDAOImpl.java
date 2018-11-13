package ro.webdata.lido.parser.parser.dao.impl.element.leaf.displayStateEdition;

import ro.webdata.lido.parser.parser.dao.complex.TextComplexTypeDAO;
import ro.webdata.lido.parser.parser.dao.element.leaf.displayStateEdition.SourceStateEditionDAO;
import ro.webdata.lido.parser.parser.dao.impl.complex.TextComplexTypeDAOImpl;
import ro.webdata.lido.parser.parser.model.element.leaf.displayStateEdition.SourceStateEdition;
import org.w3c.dom.Node;

public class SourceStateEditionDAOImpl implements SourceStateEditionDAO {
    private static TextComplexTypeDAO textComplexTypeDAO = new TextComplexTypeDAOImpl();

    public SourceStateEdition getSourceStateEdition(Node node) {
        return new SourceStateEdition(textComplexTypeDAO.getTextComplexType(node));
    }
}
