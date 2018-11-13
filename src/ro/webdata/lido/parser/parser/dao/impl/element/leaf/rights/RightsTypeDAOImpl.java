package ro.webdata.lido.parser.parser.dao.impl.element.leaf.rights;

import ro.webdata.lido.parser.parser.dao.complex.ConceptComplexTypeDAO;
import ro.webdata.lido.parser.parser.dao.element.leaf.rights.RightsTypeDAO;
import ro.webdata.lido.parser.parser.dao.impl.complex.ConceptComplexTypeDAOImpl;
import ro.webdata.lido.parser.parser.model.element.leaf.rights.RightsType;
import org.w3c.dom.Node;

public class RightsTypeDAOImpl implements RightsTypeDAO {
    private static ConceptComplexTypeDAO conceptComplexTypeDAO = new ConceptComplexTypeDAOImpl();

    public RightsType getRightsType(Node node) {
        return new RightsType(conceptComplexTypeDAO.getConceptComplexType(node));
    }
}
