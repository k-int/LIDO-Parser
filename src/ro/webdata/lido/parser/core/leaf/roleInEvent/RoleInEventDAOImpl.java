package ro.webdata.lido.parser.core.leaf.roleInEvent;

import ro.webdata.lido.parser.core.complex.conceptComplexType.ConceptComplexTypeDAO;
import ro.webdata.lido.parser.core.complex.conceptComplexType.ConceptComplexTypeDAOImpl;
import org.w3c.dom.Node;

public class RoleInEventDAOImpl implements RoleInEventDAO {
    private static ConceptComplexTypeDAO conceptComplexTypeDAO = new ConceptComplexTypeDAOImpl();

    public RoleInEvent getRoleInEvent(Node node) {
        return new RoleInEvent(conceptComplexTypeDAO.getConceptComplexType(node));
    }
}
