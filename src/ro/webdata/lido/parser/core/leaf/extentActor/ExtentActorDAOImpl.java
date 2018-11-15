package ro.webdata.lido.parser.core.leaf.extentActor;

import ro.webdata.lido.parser.core.complex.textComplexType.TextComplexTypeDAO;
import ro.webdata.lido.parser.core.complex.textComplexType.TextComplexTypeDAOImpl;
import org.w3c.dom.Node;

public class ExtentActorDAOImpl implements ExtentActorDAO {
    private static TextComplexTypeDAO textComplexTypeDAO = new TextComplexTypeDAOImpl();

    public ExtentActor getExtentActor(Node node) {
        return new ExtentActor(textComplexTypeDAO.getTextComplexType(node));
    }
}
