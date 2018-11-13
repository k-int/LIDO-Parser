package ro.webdata.lido.parser.parser.dao.impl.element.wrap;

import ro.webdata.lido.parser.parser.dao.element.set.ResourceSetDAO;
import ro.webdata.lido.parser.parser.dao.element.wrap.ResourceWrapDAO;
import ro.webdata.lido.parser.parser.dao.impl.element.set.ResourceSetDAOImpl;
import ro.webdata.lido.parser.parser.model.element.set.ResourceSet;
import ro.webdata.lido.parser.parser.model.element.wrap.ResourceWrap;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import java.util.ArrayList;

public class ResourceWrapDAOImpl implements ResourceWrapDAO {
    private static ResourceSetDAO resourceSetParser = new ResourceSetDAOImpl();

    public ResourceWrap getResourceWrap(Node node) {
        ArrayList<ResourceSet> resourceSetList = new ArrayList<ResourceSet>();
        NodeList childNodeList = node.getChildNodes();

        for (int i = 0; i < childNodeList.getLength(); i++) {
            Node child = childNodeList.item(i);
            String childName = child.getNodeName();

            if (childName.equals("lido:resourceSet")) {
                resourceSetList.add(resourceSetParser.getResourceSet(child));
            }
        }

        return new ResourceWrap(resourceSetList);
    }
}
