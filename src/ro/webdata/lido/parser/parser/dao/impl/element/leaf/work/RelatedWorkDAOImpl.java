package ro.webdata.lido.parser.parser.dao.impl.element.leaf.work;

import ro.webdata.lido.parser.parser.dao.complex.object.ObjectSetComplexTypeDAO;
import ro.webdata.lido.parser.parser.dao.element.leaf.work.RelatedWorkDAO;
import ro.webdata.lido.parser.parser.dao.impl.complex.object.ObjectSetComplexTypeDAOImpl;
import ro.webdata.lido.parser.parser.model.element.leaf.work.RelatedWork;
import org.w3c.dom.Node;

public class RelatedWorkDAOImpl implements RelatedWorkDAO {
    private static ObjectSetComplexTypeDAO objectSetComplexTypeDAO = new ObjectSetComplexTypeDAOImpl();

    public RelatedWork getRelatedWork(Node node) {
        return new RelatedWork(objectSetComplexTypeDAO.getObjectSetComplexType(node));
    }
}
