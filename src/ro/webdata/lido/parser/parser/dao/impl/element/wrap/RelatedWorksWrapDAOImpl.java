package ro.webdata.lido.parser.parser.dao.impl.element.wrap;

import ro.webdata.lido.parser.parser.dao.element.set.RelatedWorkSetDAO;
import ro.webdata.lido.parser.parser.dao.element.wrap.RelatedWorksWrapDAO;
import ro.webdata.lido.parser.parser.dao.impl.element.set.RelatedWorkSetDAOImpl;
import ro.webdata.lido.parser.parser.model.element.set.RelatedWorkSet;
import ro.webdata.lido.parser.parser.model.element.wrap.RelatedWorksWrap;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import java.util.ArrayList;

public class RelatedWorksWrapDAOImpl implements RelatedWorksWrapDAO {
    private static RelatedWorkSetDAO relatedWorkSetParser = new RelatedWorkSetDAOImpl();

    public RelatedWorksWrap getRelatedWorksWrap(Node node) {
        ArrayList<RelatedWorkSet> relatedWorkSetList = new ArrayList<RelatedWorkSet>();
        NodeList childNodeList = node.getChildNodes();

        for (int i = 0; i < childNodeList.getLength(); i++) {
            Node childNode = childNodeList.item(i);
            String childName = childNode.getNodeName();

            if (childName.equals("lido:rightsWorkSet")) {
                relatedWorkSetList.add(relatedWorkSetParser.getRelatedWorkSet(childNode));
            }
        }

        return new RelatedWorksWrap(relatedWorkSetList);
    }
}