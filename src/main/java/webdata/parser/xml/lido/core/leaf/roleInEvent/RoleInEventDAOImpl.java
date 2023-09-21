package webdata.parser.xml.lido.core.leaf.roleInEvent;

import org.w3c.dom.Node;
import ro.webdata.parser.xml.lido.core.complex.conceptComplexType.ConceptComplexTypeDAO;
import ro.webdata.parser.xml.lido.core.complex.conceptComplexType.ConceptComplexTypeDAOImpl;

public class RoleInEventDAOImpl implements RoleInEventDAO {
    private static ConceptComplexTypeDAO conceptComplexTypeDAO = new ConceptComplexTypeDAOImpl();

    public RoleInEvent getRoleInEvent(Node node) {
        return new RoleInEvent(conceptComplexTypeDAO.getConceptComplexType(node));
    }
}
