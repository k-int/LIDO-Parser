package app.java.parser.dao.impl.element.leaf.actor;

import app.java.parser.dao.complex.TextComplexTypeDAO;
import app.java.parser.dao.element.leaf.actor.DisplayActorDAO;
import app.java.parser.dao.impl.complex.TextComplexTypeDAOImpl;
import app.java.parser.model.element.leaf.actor.DisplayActor;
import org.w3c.dom.Node;

public class DisplayActorDAOImpl implements DisplayActorDAO {
    private static TextComplexTypeDAO textComplexTypeDAO = new TextComplexTypeDAOImpl();

    public DisplayActor getDisplayActor(Node node) {
        return new DisplayActor(textComplexTypeDAO.getTextComplexType(node));
    }
}
