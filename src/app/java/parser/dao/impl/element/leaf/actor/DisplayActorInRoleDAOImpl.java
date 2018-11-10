package app.java.parser.dao.impl.element.leaf.actor;

import app.java.parser.dao.complex.TextComplexTypeDAO;
import app.java.parser.dao.element.leaf.actor.DisplayActorInRoleDAO;
import app.java.parser.dao.impl.complex.TextComplexTypeDAOImpl;
import app.java.parser.model.element.leaf.actor.DisplayActorInRole;
import org.w3c.dom.Node;

public class DisplayActorInRoleDAOImpl implements DisplayActorInRoleDAO {
    private static TextComplexTypeDAO textComplexTypeDAO = new TextComplexTypeDAOImpl();

    public DisplayActorInRole getDisplayActorInRole(Node node) {
        return new DisplayActorInRole(textComplexTypeDAO.getTextComplexType(node));
    }
}
