package app.java.parser.dao.impl.element.leaf.actor;

import app.java.parser.dao.complex.TextComplexTypeDAO;
import app.java.parser.dao.element.leaf.actor.AttributionQualifierActorDAO;
import app.java.parser.dao.impl.complex.TextComplexTypeDAOImpl;
import app.java.parser.model.element.leaf.actor.AttributionQualifierActor;
import org.w3c.dom.Node;

public class AttributionQualifierActorDAOImpl implements AttributionQualifierActorDAO {
    private static TextComplexTypeDAO textComplexTypeDAO = new TextComplexTypeDAOImpl();

    public AttributionQualifierActor getAttributionQualifierActor(Node node) {
        return new AttributionQualifierActor(textComplexTypeDAO.getTextComplexType(node));
    }
}
