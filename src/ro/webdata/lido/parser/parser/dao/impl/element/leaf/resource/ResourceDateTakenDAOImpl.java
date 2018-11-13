package ro.webdata.lido.parser.parser.dao.impl.element.leaf.resource;

import ro.webdata.lido.parser.parser.dao.complex.date.DateSetComplexTypeDAO;
import ro.webdata.lido.parser.parser.dao.element.leaf.resource.ResourceDateTakenDAO;
import ro.webdata.lido.parser.parser.dao.impl.complex.date.DateSetComplexTypeDAOImpl;
import ro.webdata.lido.parser.parser.model.element.leaf.resource.ResourceDateTaken;
import org.w3c.dom.Node;

public class ResourceDateTakenDAOImpl implements ResourceDateTakenDAO {
    private static DateSetComplexTypeDAO dateSetComplexTypeDAO = new DateSetComplexTypeDAOImpl();

    public ResourceDateTaken getDateSetComplexType(Node node) {
        return new ResourceDateTaken(dateSetComplexTypeDAO.getDateSetComplexTypeParser(node));
    }
}
