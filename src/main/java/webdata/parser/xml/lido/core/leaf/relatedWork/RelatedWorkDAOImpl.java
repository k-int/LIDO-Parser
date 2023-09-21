package webdata.parser.xml.lido.core.leaf.relatedWork;

import org.w3c.dom.Node;
import ro.webdata.parser.xml.lido.core.complex.objectSetComplexType.ObjectSetComplexTypeDAO;
import ro.webdata.parser.xml.lido.core.complex.objectSetComplexType.ObjectSetComplexTypeDAOImpl;

public class RelatedWorkDAOImpl implements RelatedWorkDAO {
    private static ObjectSetComplexTypeDAO objectSetComplexTypeDAO = new ObjectSetComplexTypeDAOImpl();

    public RelatedWork getRelatedWork(Node node) {
        return new RelatedWork(objectSetComplexTypeDAO.getObjectSetComplexType(node));
    }
}
