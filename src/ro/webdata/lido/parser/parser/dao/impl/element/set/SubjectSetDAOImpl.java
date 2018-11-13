package ro.webdata.lido.parser.parser.dao.impl.element.set;

import ro.webdata.lido.parser.common.Utils;
import ro.webdata.lido.parser.parser.dao.complex.subject.SubjectSetComplexTypeDAO;
import ro.webdata.lido.parser.parser.dao.element.set.SubjectSetDAO;
import ro.webdata.lido.parser.parser.dao.impl.complex.subject.SubjectSetComplexTypeDAOImpl;
import ro.webdata.lido.parser.parser.model.attribute.lido.LidoSortOrder;
import ro.webdata.lido.parser.parser.model.element.set.SubjectSet;
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
