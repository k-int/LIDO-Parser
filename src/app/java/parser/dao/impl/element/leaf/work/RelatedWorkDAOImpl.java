package app.java.parser.dao.impl.element.leaf.work;

import app.java.parser.dao.complex.object.ObjectSetComplexTypeDAO;
import app.java.parser.dao.element.leaf.work.RelatedWorkDAO;
import app.java.parser.dao.impl.complex.object.ObjectSetComplexTypeDAOImpl;
import app.java.parser.model.element.leaf.work.RelatedWork;
import org.w3c.dom.Node;

public class RelatedWorkDAOImpl implements RelatedWorkDAO {
    private static ObjectSetComplexTypeDAO objectSetComplexTypeDAO = new ObjectSetComplexTypeDAOImpl();

    public RelatedWork getRelatedWork(Node node) {
        return new RelatedWork(objectSetComplexTypeDAO.getObjectSetComplexType(node));
    }
}
