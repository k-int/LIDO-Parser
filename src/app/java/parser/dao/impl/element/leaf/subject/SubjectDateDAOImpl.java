package app.java.parser.dao.impl.element.leaf.subject;

import app.java.common.Utils;
import app.java.parser.dao.complex.date.DateSetComplexTypeDAO;
import app.java.parser.dao.element.leaf.subject.SubjectDateDAO;
import app.java.parser.dao.impl.complex.date.DateSetComplexTypeDAOImpl;
import app.java.parser.model.attribute.lido.LidoSortOrder;
import app.java.parser.model.element.leaf.subject.SubjectDate;
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
