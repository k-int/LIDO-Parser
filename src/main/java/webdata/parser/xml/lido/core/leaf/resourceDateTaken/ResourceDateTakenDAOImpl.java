package webdata.parser.xml.lido.core.leaf.resourceDateTaken;

import org.w3c.dom.Node;
import ro.webdata.parser.xml.lido.core.complex.dateSetComplexType.DateSetComplexTypeDAO;
import ro.webdata.parser.xml.lido.core.complex.dateSetComplexType.DateSetComplexTypeDAOImpl;

public class ResourceDateTakenDAOImpl implements ResourceDateTakenDAO {
    private static DateSetComplexTypeDAO dateSetComplexTypeDAO = new DateSetComplexTypeDAOImpl();

    public ResourceDateTaken getDateSetComplexType(Node node) {
        return new ResourceDateTaken(dateSetComplexTypeDAO.getDateSetComplexTypeParser(node));
    }
}
