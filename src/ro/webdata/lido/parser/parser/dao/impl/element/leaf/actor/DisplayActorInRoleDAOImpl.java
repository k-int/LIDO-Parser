package ro.webdata.lido.parser.parser.dao.impl.element.leaf.actor;

import ro.webdata.lido.parser.parser.dao.complex.TextComplexTypeDAO;
import ro.webdata.lido.parser.parser.dao.element.leaf.actor.DisplayActorInRoleDAO;
import ro.webdata.lido.parser.parser.dao.impl.complex.TextComplexTypeDAOImpl;
import ro.webdata.lido.parser.parser.model.element.leaf.actor.DisplayActorInRole;
import org.w3c.dom.Node;

public class DisplayActorInRoleDAOImpl implements DisplayActorInRoleDAO {
    private static TextComplexTypeDAO textComplexTypeDAO = new TextComplexTypeDAOImpl();

    public DisplayActorInRole getDisplayActorInRole(Node node) {
        return new DisplayActorInRole(textComplexTypeDAO.getTextComplexType(node));
    }
}
