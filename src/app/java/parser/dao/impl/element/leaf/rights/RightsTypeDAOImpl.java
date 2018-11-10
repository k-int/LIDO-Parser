package app.java.parser.dao.impl.element.leaf.rights;

import app.java.parser.dao.complex.ConceptComplexTypeDAO;
import app.java.parser.dao.element.leaf.rights.RightsTypeDAO;
import app.java.parser.dao.impl.complex.ConceptComplexTypeDAOImpl;
import app.java.parser.model.element.leaf.rights.RightsType;
import org.w3c.dom.Node;

public class RightsTypeDAOImpl implements RightsTypeDAO {
    private static ConceptComplexTypeDAO conceptComplexTypeDAO = new ConceptComplexTypeDAOImpl();

    public RightsType getRightsType(Node node) {
        return new RightsType(conceptComplexTypeDAO.getConceptComplexType(node));
    }
}
