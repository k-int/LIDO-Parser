package ro.webdata.lido.parser.core.complex.repositorySetComplexType;

import ro.webdata.lido.parser.common.Utils;
import ro.webdata.lido.parser.core.leaf.repositoryLocation.RepositoryLocationDAO;
import ro.webdata.lido.parser.core.leaf.repositoryName.RepositoryNameDAO;
import ro.webdata.lido.parser.core.leaf.workID.WorkIDDAO;
import ro.webdata.lido.parser.core.leaf.repositoryLocation.RepositoryLocationDAOImpl;
import ro.webdata.lido.parser.core.leaf.repositoryName.RepositoryNameDAOImpl;
import ro.webdata.lido.parser.core.leaf.workID.WorkIDDAOImpl;
import ro.webdata.lido.parser.core.attribute.LidoSortOrder;
import ro.webdata.lido.parser.core.attribute.LidoType;
import ro.webdata.lido.parser.core.leaf.repositoryLocation.RepositoryLocation;
import ro.webdata.lido.parser.core.leaf.repositoryName.RepositoryName;
import ro.webdata.lido.parser.core.leaf.workID.WorkID;
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