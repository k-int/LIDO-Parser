package app.java.parser.dao.impl.element.leaf.actor;

import app.java.parser.dao.complex.TextComplexTypeDAO;
import app.java.parser.dao.element.leaf.actor.ExtentActorDAO;
import app.java.parser.dao.impl.complex.TextComplexTypeDAOImpl;
import app.java.parser.model.element.leaf.actor.ExtentActor;
import org.w3c.dom.Node;

public class ExtentActorDAOImpl implements ExtentActorDAO {
    private static TextComplexTypeDAO textComplexTypeDAO = new TextComplexTypeDAOImpl();

    public ExtentActor getExtentActor(Node node) {
        return new ExtentActor(textComplexTypeDAO.getTextComplexType(node));
    }
}
