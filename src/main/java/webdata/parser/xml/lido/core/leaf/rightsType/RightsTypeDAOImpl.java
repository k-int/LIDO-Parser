package webdata.parser.xml.lido.core.leaf.rightsType;

import org.w3c.dom.Node;
import ro.webdata.parser.xml.lido.core.complex.conceptComplexType.ConceptComplexTypeDAO;
import ro.webdata.parser.xml.lido.core.complex.conceptComplexType.ConceptComplexTypeDAOImpl;

public class RightsTypeDAOImpl implements RightsTypeDAO {
    private static ConceptComplexTypeDAO conceptComplexTypeDAO = new ConceptComplexTypeDAOImpl();

    public RightsType getRightsType(Node node) {
        return new RightsType(conceptComplexTypeDAO.getConceptComplexType(node));
    }
}
