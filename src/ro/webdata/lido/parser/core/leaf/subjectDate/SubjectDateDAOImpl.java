package ro.webdata.lido.parser.core.leaf.subjectDate;

import ro.webdata.lido.parser.common.Utils;
import ro.webdata.lido.parser.core.complex.dateSetComplexType.DateSetComplexTypeDAO;
import ro.webdata.lido.parser.core.complex.dateSetComplexType.DateSetComplexTypeDAOImpl;
import ro.webdata.lido.parser.core.attribute.LidoSortOrder;
import org.w3c.dom.Node;

import java.util.HashMap;

public class SubjectDateDAOImpl implements SubjectDateDAO {
    private static DateSetComplexTypeDAO dateSetComplexTypeDAO = new DateSetComplexTypeDAOImpl();
    private static Utils utils = new Utils();

    public SubjectDate getSubjectDate(Node node) {
        HashMap<String, String> attributes = utils.getAttributes(node);

        return new SubjectDate(
                dateSetComplexTypeDAO.getDateSetComplexTypeParser(node),
                new LidoSortOrder(attributes.get("lido:sortorder"))
        );
    }
}
