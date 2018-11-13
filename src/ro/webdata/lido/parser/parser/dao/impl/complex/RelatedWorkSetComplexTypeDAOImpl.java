package ro.webdata.lido.parser.parser.dao.impl.complex;

import ro.webdata.lido.parser.parser.dao.complex.RelatedWorkSetComplexTypeDAO;
import ro.webdata.lido.parser.parser.dao.element.leaf.work.RelatedWorkDAO;
import ro.webdata.lido.parser.parser.dao.element.leaf.work.RelatedWorkRelTypeDAO;
import ro.webdata.lido.parser.parser.dao.impl.element.leaf.work.RelatedWorkDAOImpl;
import ro.webdata.lido.parser.parser.dao.impl.element.leaf.work.RelatedWorkRelTypeDAOImpl;
import ro.webdata.lido.parser.parser.model.complex.RelatedWorkSetComplexType;
import ro.webdata.lido.parser.parser.model.element.leaf.work.RelatedWork;
import ro.webdata.lido.parser.parser.model.element.leaf.work.RelatedWorkRelType;
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
