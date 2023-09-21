package webdata.parser.xml.lido.core.leaf.genderActor;

import org.w3c.dom.Node;
import ro.webdata.parser.xml.lido.core.complex.textComplexType.TextComplexTypeDAO;
import ro.webdata.parser.xml.lido.core.complex.textComplexType.TextComplexTypeDAOImpl;

public class GenderActorDAOImpl implements GenderActorDAO {
    private static TextComplexTypeDAO textComplexTypeDAO = new TextComplexTypeDAOImpl();

    public GenderActor getGenderActor(Node node) {
        return new GenderActor(textComplexTypeDAO.getTextComplexType(node));
    }
}
