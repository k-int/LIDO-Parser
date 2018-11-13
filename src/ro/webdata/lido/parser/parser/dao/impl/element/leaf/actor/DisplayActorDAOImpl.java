package ro.webdata.lido.parser.parser.dao.impl.element.leaf.actor;

import ro.webdata.lido.parser.parser.dao.complex.TextComplexTypeDAO;
import ro.webdata.lido.parser.parser.dao.element.leaf.actor.DisplayActorDAO;
import ro.webdata.lido.parser.parser.dao.impl.complex.TextComplexTypeDAOImpl;
import ro.webdata.lido.parser.parser.model.element.leaf.actor.DisplayActor;
import org.w3c.dom.Node;

public class DisplayActorDAOImpl implements DisplayActorDAO {
    private static TextComplexTypeDAO textComplexTypeDAO = new TextComplexTypeDAOImpl();

    public DisplayActor getDisplayActor(Node node) {
        return new DisplayActor(textComplexTypeDAO.getTextComplexType(node));
    }
}
