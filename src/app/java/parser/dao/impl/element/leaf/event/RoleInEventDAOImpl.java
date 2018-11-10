package app.java.parser.dao.impl.element.leaf.event;

import app.java.parser.dao.complex.ConceptComplexTypeDAO;
import app.java.parser.dao.element.leaf.event.RoleInEventDAO;
import app.java.parser.dao.impl.complex.ConceptComplexTypeDAOImpl;
import app.java.parser.model.element.leaf.event.RoleInEvent;
import org.w3c.dom.Node;

public class RoleInEventDAOImpl implements RoleInEventDAO {
    private static ConceptComplexTypeDAO conceptComplexTypeDAO = new ConceptComplexTypeDAOImpl();

    public RoleInEvent getRoleInEvent(Node node) {
        return new RoleInEvent(conceptComplexTypeDAO.getConceptComplexType(node));
    }
}
