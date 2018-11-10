package app.java.parser.dao.impl.complex;

import app.java.common.Utils;
import app.java.parser.dao.complex.RepositorySetComplexTypeDAO;
import app.java.parser.dao.element.leaf.repository.RepositoryLocationDAO;
import app.java.parser.dao.element.leaf.repository.RepositoryNameDAO;
import app.java.parser.dao.element.leaf.work.WorkIDDAO;
import app.java.parser.dao.impl.element.leaf.repository.RepositoryLocationDAOImpl;
import app.java.parser.dao.impl.element.leaf.repository.RepositoryNameDAOImpl;
import app.java.parser.dao.impl.element.leaf.work.WorkIDDAOImpl;
import app.java.parser.model.attribute.lido.LidoSortOrder;
import app.java.parser.model.attribute.lido.LidoType;
import app.java.parser.model.complex.RepositorySetComplexType;
import app.java.parser.model.element.leaf.repository.RepositoryLocation;
import app.java.parser.model.element.leaf.repository.RepositoryName;
import app.java.parser.model.element.leaf.work.WorkID;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import java.util.ArrayList;
import java.util.HashMap;

public class RepositorySetComplexTypeDAOImpl implements RepositorySetComplexTypeDAO {
    private static RepositoryNameDAO repositoryNameParser = new RepositoryNameDAOImpl();
    private static WorkIDDAO workIDDAO = new WorkIDDAOImpl();
    private static RepositoryLocationDAO repositoryLocationParser = new RepositoryLocationDAOImpl();
    private static Utils utils = new Utils();

    public RepositorySetComplexType getRepositorySetComplexType(Node node) {
        RepositoryName repositoryName = null;
        ArrayList<WorkID> workIDList = new ArrayList<WorkID>();
        RepositoryLocation repositoryLocation = null;
        HashMap<String, String> attributes = utils.getAttributes(node);

        NodeList childNodeList = node.getChildNodes();
        for (int i = 0; i < childNodeList.getLength(); i++) {
            Node child = childNodeList.item(i);
            String childName = child.getNodeName();

            switch (childName) {
                case "lido:repositoryName":
                    repositoryName = repositoryNameParser.getRepositoryName(child);
                    break;
                case "lido:workID":
                    workIDList.add(workIDDAO.getWorkID(child));
                    break;
                case "lido:repositoryLocation":
                    repositoryLocation = repositoryLocationParser.getRepositoryLocation(child);
                    break;
                default: break;
            }
        }

        return new RepositorySetComplexType(
                repositoryName, workIDList, repositoryLocation,
                new LidoType(attributes.get("lido:type")),
                new LidoSortOrder(attributes.get("lido:sortorder"))
        );
    }
}
