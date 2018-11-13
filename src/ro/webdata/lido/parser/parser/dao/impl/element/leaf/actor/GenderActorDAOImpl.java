package ro.webdata.lido.parser.parser.dao.impl.element.leaf.actor;

import ro.webdata.lido.parser.parser.dao.complex.TextComplexTypeDAO;
import ro.webdata.lido.parser.parser.dao.element.leaf.actor.GenderActorDAO;
import ro.webdata.lido.parser.parser.dao.impl.complex.TextComplexTypeDAOImpl;
import ro.webdata.lido.parser.parser.model.element.leaf.actor.GenderActor;
import org.w3c.dom.Node;

public class GenderActorDAOImpl implements GenderActorDAO {
    private static TextComplexTypeDAO textComplexTypeDAO = new TextComplexTypeDAOImpl();

    public GenderActor getGenderActor(Node node) {
        return new GenderActor(textComplexTypeDAO.getTextComplexType(node));
    }
}
