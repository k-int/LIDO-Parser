package webdata.parser.xml.lido.core.leaf.extentActor;

import org.w3c.dom.Node;
import ro.webdata.parser.xml.lido.core.complex.textComplexType.TextComplexTypeDAO;
import ro.webdata.parser.xml.lido.core.complex.textComplexType.TextComplexTypeDAOImpl;

public class ExtentActorDAOImpl implements ExtentActorDAO {
    private static TextComplexTypeDAO textComplexTypeDAO = new TextComplexTypeDAOImpl();

    public ExtentActor getExtentActor(Node node) {
        return new ExtentActor(textComplexTypeDAO.getTextComplexType(node));
    }
}
