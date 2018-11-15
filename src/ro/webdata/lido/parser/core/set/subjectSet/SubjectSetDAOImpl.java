package ro.webdata.lido.parser.core.set.subjectSet;

import ro.webdata.lido.parser.common.Utils;
import ro.webdata.lido.parser.core.complex.subjectSetComplexType.SubjectSetComplexTypeDAO;
import ro.webdata.lido.parser.core.complex.subjectSetComplexType.SubjectSetComplexTypeDAOImpl;
import ro.webdata.lido.parser.core.attribute.LidoSortOrder;
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
