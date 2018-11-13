package ro.webdata.lido.parser.parser.dao.impl.element.leaf.event;

import ro.webdata.lido.parser.parser.dao.complex.ConceptComplexTypeDAO;
import ro.webdata.lido.parser.parser.dao.element.leaf.event.RoleInEventDAO;
import ro.webdata.lido.parser.parser.dao.impl.complex.ConceptComplexTypeDAOImpl;
import ro.webdata.lido.parser.parser.model.element.leaf.event.RoleInEvent;
import org.w3c.dom.Node;

public class RoleInEventDAOImpl implements RoleInEventDAO {
    private static ConceptComplexTypeDAO conceptComplexTypeDAO = new ConceptComplexTypeDAOImpl();

    public RoleInEvent getRoleInEvent(Node node) {
        return new RoleInEvent(conceptComplexTypeDAO.getConceptComplexType(node));
    }
}
