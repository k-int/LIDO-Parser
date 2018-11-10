package app.java.parser.dao.impl.element.set;

import app.java.common.Utils;
import app.java.parser.dao.complex.subject.SubjectSetComplexTypeDAO;
import app.java.parser.dao.element.set.SubjectSetDAO;
import app.java.parser.dao.impl.complex.subject.SubjectSetComplexTypeDAOImpl;
import app.java.parser.model.attribute.lido.LidoSortOrder;
import app.java.parser.model.element.set.SubjectSet;
import org.w3c.dom.Node;

import java.util.HashMap;

public class SubjectSetDAOImpl implements SubjectSetDAO {
    private static SubjectSetComplexTypeDAO subjectSetComplexTypeDAO = new SubjectSetComplexTypeDAOImpl();
    private static Utils utils = new Utils();

    public SubjectSet getSubjectSet(Node node) {
        HashMap<String, String> attributes = utils.getAttributes(node);

        return new SubjectSet(
                subjectSetComplexTypeDAO.getSubjectSetComplexType(node),
                new LidoSortOrder(attributes.get("lido:sortorder"))
        );
    }
}
