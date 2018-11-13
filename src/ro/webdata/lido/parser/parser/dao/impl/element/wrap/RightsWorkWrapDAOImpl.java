package ro.webdata.lido.parser.parser.dao.impl.element.wrap;

import ro.webdata.lido.parser.parser.dao.element.set.RightsWorkSetDAO;
import ro.webdata.lido.parser.parser.dao.element.wrap.RightsWorkWrapDAO;
import ro.webdata.lido.parser.parser.dao.impl.element.set.RightsWorkSetDAOImpl;
import ro.webdata.lido.parser.parser.model.element.set.RightsWorkSet;
import ro.webdata.lido.parser.parser.model.element.wrap.RightsWorkWrap;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import java.util.ArrayList;

public class RightsWorkWrapDAOImpl implements RightsWorkWrapDAO {
    private static RightsWorkSetDAO rightsWorkSetParser = new RightsWorkSetDAOImpl();

    public RightsWorkWrap getRightsWorkWrapParser(Node node) {
        ArrayList<RightsWorkSet> rightsWorkSetList = new ArrayList<RightsWorkSet>();
        NodeList childNodeList = node.getChildNodes();

        for (int i = 0; i < childNodeList.getLength(); i++) {
            Node childNode = childNodeList.item(i);
            String childName = childNode.getNodeName();

            if (childName.equals("lido:rightsWorkSet")) {
                rightsWorkSetList.add(rightsWorkSetParser.getRightsWorkSet(childNode));
            }
        }

        return new RightsWorkWrap(rightsWorkSetList);
    }
}
