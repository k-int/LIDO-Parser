package ro.webdata.lido.parser.core.leaf.genderActor;

import ro.webdata.lido.parser.core.complex.textComplexType.TextComplexTypeDAO;
import ro.webdata.lido.parser.core.complex.textComplexType.TextComplexTypeDAOImpl;
import org.w3c.dom.Node;

public class GenderActorDAOImpl implements GenderActorDAO {
    private static TextComplexTypeDAO textComplexTypeDAO = new TextComplexTypeDAOImpl();

    public GenderActor getGenderActor(Node node) {
        return new GenderActor(textComplexTypeDAO.getTextComplexType(node));
    }
}
