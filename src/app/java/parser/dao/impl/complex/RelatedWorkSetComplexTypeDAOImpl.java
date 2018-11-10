package app.java.parser.dao.impl.complex;

import app.java.parser.dao.complex.RelatedWorkSetComplexTypeDAO;
import app.java.parser.dao.element.leaf.work.RelatedWorkDAO;
import app.java.parser.dao.element.leaf.work.RelatedWorkRelTypeDAO;
import app.java.parser.dao.impl.element.leaf.work.RelatedWorkDAOImpl;
import app.java.parser.dao.impl.element.leaf.work.RelatedWorkRelTypeDAOImpl;
import app.java.parser.model.complex.RelatedWorkSetComplexType;
import app.java.parser.model.element.leaf.work.RelatedWork;
import app.java.parser.model.element.leaf.work.RelatedWorkRelType;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

public class RelatedWorkSetComplexTypeDAOImpl implements RelatedWorkSetComplexTypeDAO {
    private static RelatedWorkDAO relatedWorkParser = new RelatedWorkDAOImpl();
    private static RelatedWorkRelTypeDAO relatedWorkRelTypeParser = new RelatedWorkRelTypeDAOImpl();

    public RelatedWorkSetComplexType getRelatedWorkSetComplexType(Node node) {
        RelatedWork relatedWork = null;
        RelatedWorkRelType relatedWorkRelType = null;

        NodeList childNodeList = node.getChildNodes();
        for (int i = 0; i < childNodeList.getLength(); i++) {
            Node child = childNodeList.item(i);
            String childName = child.getNodeName();

            switch (childName) {
                case "lido:relatedWork":
                    relatedWork = relatedWorkParser.getRelatedWork(child);
                    break;
                case "lido:date":
                    relatedWorkRelType = relatedWorkRelTypeParser.getRelatedWorkRelType(child);
                    break;
                default: break;
            }
        }

        return new RelatedWorkSetComplexType(relatedWork, relatedWorkRelType);
    }
}
