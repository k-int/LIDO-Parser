package ro.webdata.lido.parser.parser.dao.impl.element.wrap;

import ro.webdata.lido.parser.parser.dao.element.wrap.ObjectRelationWrapDAO;
import ro.webdata.lido.parser.parser.dao.element.wrap.RelatedWorksWrapDAO;
import ro.webdata.lido.parser.parser.dao.element.wrap.SubjectWrapDAO;
import ro.webdata.lido.parser.parser.model.element.wrap.ObjectRelationWrap;
import ro.webdata.lido.parser.parser.model.element.wrap.RelatedWorksWrap;
import ro.webdata.lido.parser.parser.model.element.wrap.SubjectWrap;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

public class ObjectRelationWrapDAOImpl implements ObjectRelationWrapDAO {
    private static SubjectWrapDAO subjectWrapDAO = new SubjectWrapDAOImpl();
    private static RelatedWorksWrapDAO relatedWorksWrapDAO = new RelatedWorksWrapDAOImpl();

    public ObjectRelationWrap getObjectRelationWrap(Node node) {
        SubjectWrap subjectWrap = null;
        RelatedWorksWrap relatedWorksWrap = null;

        NodeList childNodeList = node.getChildNodes();
        for (int i = 0; i < childNodeList.getLength(); i++) {
            Node child = childNodeList.item(i);
            String childName = child.getNodeName();

            switch (childName) {
                case "lido:subjectWrap":
                    subjectWrap = subjectWrapDAO.getSubjectWrap(child);
                    break;
                case "lido:relatedWorksWrap":
                    relatedWorksWrap = relatedWorksWrapDAO.getRelatedWorksWrap(child);
                    break;
                default: break;
            }
        }

        return new ObjectRelationWrap(subjectWrap, relatedWorksWrap);
    }
}
