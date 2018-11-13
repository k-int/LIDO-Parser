package ro.webdata.lido.parser.parser.dao.impl.element.leaf.displayStateEdition;

import ro.webdata.lido.parser.parser.dao.complex.TextComplexTypeDAO;
import ro.webdata.lido.parser.parser.dao.element.leaf.displayStateEdition.DisplayEditionDAO;
import ro.webdata.lido.parser.parser.dao.impl.complex.TextComplexTypeDAOImpl;
import ro.webdata.lido.parser.parser.model.element.leaf.displayStateEdition.DisplayEdition;
import org.w3c.dom.Node;

public class DisplayEditionDAOImpl implements DisplayEditionDAO {
    private TextComplexTypeDAO textComplexTypeDAO = new TextComplexTypeDAOImpl();

    public DisplayEdition getDisplayEdition(Node node) {
        return new DisplayEdition(textComplexTypeDAO.getTextComplexType(node));
    }
}
