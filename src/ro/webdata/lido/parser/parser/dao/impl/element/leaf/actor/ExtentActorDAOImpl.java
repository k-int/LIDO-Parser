package ro.webdata.lido.parser.parser.dao.impl.element.leaf.actor;

import ro.webdata.lido.parser.parser.dao.complex.TextComplexTypeDAO;
import ro.webdata.lido.parser.parser.dao.element.leaf.actor.ExtentActorDAO;
import ro.webdata.lido.parser.parser.dao.impl.complex.TextComplexTypeDAOImpl;
import ro.webdata.lido.parser.parser.model.element.leaf.actor.ExtentActor;
import org.w3c.dom.Node;

public class ExtentActorDAOImpl implements ExtentActorDAO {
    private static TextComplexTypeDAO textComplexTypeDAO = new TextComplexTypeDAOImpl();

    public ExtentActor getExtentActor(Node node) {
        return new ExtentActor(textComplexTypeDAO.getTextComplexType(node));
    }
}
