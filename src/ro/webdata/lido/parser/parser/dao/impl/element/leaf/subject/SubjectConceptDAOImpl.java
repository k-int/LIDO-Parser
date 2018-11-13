package ro.webdata.lido.parser.parser.dao.impl.element.leaf.subject;

import ro.webdata.lido.parser.common.Utils;
import ro.webdata.lido.parser.parser.dao.complex.ConceptComplexTypeDAO;
import ro.webdata.lido.parser.parser.dao.element.leaf.subject.SubjectConceptDAO;
import ro.webdata.lido.parser.parser.dao.impl.complex.ConceptComplexTypeDAOImpl;
import ro.webdata.lido.parser.parser.model.attribute.lido.LidoSortOrder;
import ro.webdata.lido.parser.parser.model.element.leaf.subject.SubjectConcept;
import org.w3c.dom.Node;

import java.util.HashMap;

public class SubjectConceptDAOImpl implements SubjectConceptDAO {
    private static ConceptComplexTypeDAO conceptComplexTypeDAO = new ConceptComplexTypeDAOImpl();
    private static Utils utils = new Utils();

    public SubjectConcept getSubjectConcept(Node node) {
        HashMap<String, String> attributes = utils.getAttributes(node);

        return new SubjectConcept(
                conceptComplexTypeDAO.getConceptComplexType(node),
                new LidoSortOrder(attributes.get("lido:sortorder"))
        );
    }
}
