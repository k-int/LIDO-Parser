package app.java.parser.dao.impl.element.leaf.subject;

import app.java.common.Utils;
import app.java.parser.dao.complex.ConceptComplexTypeDAO;
import app.java.parser.dao.element.leaf.subject.SubjectConceptDAO;
import app.java.parser.dao.impl.complex.ConceptComplexTypeDAOImpl;
import app.java.parser.model.attribute.lido.LidoSortOrder;
import app.java.parser.model.element.leaf.subject.SubjectConcept;
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
