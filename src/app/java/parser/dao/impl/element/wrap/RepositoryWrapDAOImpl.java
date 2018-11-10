package app.java.parser.dao.impl.element.wrap;

import app.java.parser.dao.element.set.RepositorySetDAO;
import app.java.parser.dao.element.wrap.RepositoryWrapDAO;
import app.java.parser.dao.impl.element.set.RepositorySetDAOImpl;
import app.java.parser.model.element.set.RepositorySet;
import app.java.parser.model.element.wrap.RepositoryWrap;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import java.util.ArrayList;

public class RepositoryWrapDAOImpl implements RepositoryWrapDAO {
    private static RepositorySetDAO repositorySetParser = new RepositorySetDAOImpl();

    public RepositoryWrap getRepositoryWrap(Node node) {
        ArrayList<RepositorySet> repositorySetList = new ArrayList<RepositorySet>();
        NodeList childNodeList = node.getChildNodes();

        for (int i = 0; i < childNodeList.getLength(); i++) {
            Node child = childNodeList.item(i);
            String childName = child.getNodeName();

            if (childName.equals("lido:repositorySet")) {
                repositorySetList.add(repositorySetParser.getRepositorySet(child));
            }
        }

        return new RepositoryWrap(repositorySetList);
    }
}
