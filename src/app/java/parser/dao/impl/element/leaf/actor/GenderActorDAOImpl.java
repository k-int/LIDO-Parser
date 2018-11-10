package app.java.parser.dao.impl.element.leaf.actor;

import app.java.parser.dao.complex.TextComplexTypeDAO;
import app.java.parser.dao.element.leaf.actor.GenderActorDAO;
import app.java.parser.dao.impl.complex.TextComplexTypeDAOImpl;
import app.java.parser.model.element.leaf.actor.GenderActor;
import org.w3c.dom.Node;

public class GenderActorDAOImpl implements GenderActorDAO {
    private static TextComplexTypeDAO textComplexTypeDAO = new TextComplexTypeDAOImpl();

    public GenderActor getGenderActor(Node node) {
        return new GenderActor(textComplexTypeDAO.getTextComplexType(node));
    }
}
