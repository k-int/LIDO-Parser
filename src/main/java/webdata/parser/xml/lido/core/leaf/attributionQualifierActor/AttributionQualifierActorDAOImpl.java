package webdata.parser.xml.lido.core.leaf.attributionQualifierActor;

import org.w3c.dom.Node;
import ro.webdata.parser.xml.lido.core.complex.textComplexType.TextComplexTypeDAO;
import ro.webdata.parser.xml.lido.core.complex.textComplexType.TextComplexTypeDAOImpl;

public class AttributionQualifierActorDAOImpl implements AttributionQualifierActorDAO {
    private static TextComplexTypeDAO textComplexTypeDAO = new TextComplexTypeDAOImpl();

    public AttributionQualifierActor getAttributionQualifierActor(Node node) {
        return new AttributionQualifierActor(textComplexTypeDAO.getTextComplexType(node));
    }
}
