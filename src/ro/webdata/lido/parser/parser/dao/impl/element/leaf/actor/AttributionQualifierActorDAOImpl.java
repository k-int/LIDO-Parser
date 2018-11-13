package ro.webdata.lido.parser.parser.dao.impl.element.leaf.actor;

import ro.webdata.lido.parser.parser.dao.complex.TextComplexTypeDAO;
import ro.webdata.lido.parser.parser.dao.element.leaf.actor.AttributionQualifierActorDAO;
import ro.webdata.lido.parser.parser.dao.impl.complex.TextComplexTypeDAOImpl;
import ro.webdata.lido.parser.parser.model.element.leaf.actor.AttributionQualifierActor;
import org.w3c.dom.Node;

public class AttributionQualifierActorDAOImpl implements AttributionQualifierActorDAO {
    private static TextComplexTypeDAO textComplexTypeDAO = new TextComplexTypeDAOImpl();

    public AttributionQualifierActor getAttributionQualifierActor(Node node) {
        return new AttributionQualifierActor(textComplexTypeDAO.getTextComplexType(node));
    }
}
