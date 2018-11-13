package ro.webdata.lido.parser.parser.dao.impl.element.leaf.event;

import ro.webdata.lido.parser.parser.dao.complex.ConceptComplexTypeDAO;
import ro.webdata.lido.parser.parser.dao.element.leaf.event.RelatedEventRelTypeDAO;
import ro.webdata.lido.parser.parser.dao.impl.complex.ConceptComplexTypeDAOImpl;
import ro.webdata.lido.parser.parser.model.element.leaf.event.RelatedEventRelType;
import org.w3c.dom.Node;

public class RelatedEventRelTypeDAOImpl implements RelatedEventRelTypeDAO {
    private static ConceptComplexTypeDAO conceptComplexTypeDAO = new ConceptComplexTypeDAOImpl();

    public RelatedEventRelType getRelatedEventRelType(Node node) {
        return new RelatedEventRelType(conceptComplexTypeDAO.getConceptComplexType(node));
    }
}
