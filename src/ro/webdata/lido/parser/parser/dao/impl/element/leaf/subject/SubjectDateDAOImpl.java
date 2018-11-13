package ro.webdata.lido.parser.parser.dao.impl.element.leaf.subject;

import ro.webdata.lido.parser.common.Utils;
import ro.webdata.lido.parser.parser.dao.complex.date.DateSetComplexTypeDAO;
import ro.webdata.lido.parser.parser.dao.element.leaf.subject.SubjectDateDAO;
import ro.webdata.lido.parser.parser.dao.impl.complex.date.DateSetComplexTypeDAOImpl;
import ro.webdata.lido.parser.parser.model.attribute.lido.LidoSortOrder;
import ro.webdata.lido.parser.parser.model.element.leaf.subject.SubjectDate;
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
