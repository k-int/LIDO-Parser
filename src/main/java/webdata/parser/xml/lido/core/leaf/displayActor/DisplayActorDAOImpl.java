package webdata.parser.xml.lido.core.leaf.displayActor;

import org.w3c.dom.Node;
import ro.webdata.parser.xml.lido.core.complex.textComplexType.TextComplexTypeDAO;
import ro.webdata.parser.xml.lido.core.complex.textComplexType.TextComplexTypeDAOImpl;

public class DisplayActorDAOImpl implements DisplayActorDAO {
    private static TextComplexTypeDAO textComplexTypeDAO = new TextComplexTypeDAOImpl();

    public DisplayActor getDisplayActor(Node node) {
        return new DisplayActor(textComplexTypeDAO.getTextComplexType(node));
    }
}
