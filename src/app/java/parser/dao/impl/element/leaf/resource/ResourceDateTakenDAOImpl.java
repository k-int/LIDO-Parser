package app.java.parser.dao.impl.element.leaf.resource;

import app.java.parser.dao.complex.date.DateSetComplexTypeDAO;
import app.java.parser.dao.element.leaf.resource.ResourceDateTakenDAO;
import app.java.parser.dao.impl.complex.date.DateSetComplexTypeDAOImpl;
import app.java.parser.model.element.leaf.resource.ResourceDateTaken;
import org.w3c.dom.Node;

public class ResourceDateTakenDAOImpl implements ResourceDateTakenDAO {
    private static DateSetComplexTypeDAO dateSetComplexTypeDAO = new DateSetComplexTypeDAOImpl();

    public ResourceDateTaken getDateSetComplexType(Node node) {
        return new ResourceDateTaken(dateSetComplexTypeDAO.getDateSetComplexTypeParser(node));
    }
}
