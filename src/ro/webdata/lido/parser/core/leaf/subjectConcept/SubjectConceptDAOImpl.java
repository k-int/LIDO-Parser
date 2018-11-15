package ro.webdata.lido.parser.core.leaf.subjectConcept;

import ro.webdata.lido.parser.common.Utils;
import ro.webdata.lido.parser.core.complex.conceptComplexType.ConceptComplexTypeDAO;
import ro.webdata.lido.parser.core.complex.conceptComplexType.ConceptComplexTypeDAOImpl;
import ro.webdata.lido.parser.core.attribute.LidoSortOrder;
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
