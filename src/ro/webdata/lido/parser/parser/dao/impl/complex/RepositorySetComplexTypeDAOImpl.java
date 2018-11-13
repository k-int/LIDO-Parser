package ro.webdata.lido.parser.parser.dao.impl.complex;

import ro.webdata.lido.parser.common.Utils;
import ro.webdata.lido.parser.parser.dao.complex.RepositorySetComplexTypeDAO;
import ro.webdata.lido.parser.parser.dao.element.leaf.repository.RepositoryLocationDAO;
import ro.webdata.lido.parser.parser.dao.element.leaf.repository.RepositoryNameDAO;
import ro.webdata.lido.parser.parser.dao.element.leaf.work.WorkIDDAO;
import ro.webdata.lido.parser.parser.dao.impl.element.leaf.repository.RepositoryLocationDAOImpl;
import ro.webdata.lido.parser.parser.dao.impl.element.leaf.repository.RepositoryNameDAOImpl;
import ro.webdata.lido.parser.parser.dao.impl.element.leaf.work.WorkIDDAOImpl;
import ro.webdata.lido.parser.parser.model.attribute.lido.LidoSortOrder;
import ro.webdata.lido.parser.parser.model.attribute.lido.LidoType;
import ro.webdata.lido.parser.parser.model.complex.RepositorySetComplexType;
import ro.webdata.lido.parser.parser.model.element.leaf.repository.RepositoryLocation;
import ro.webdata.lido.parser.parser.model.element.leaf.repository.RepositoryName;
import ro.webdata.lido.parser.parser.model.element.leaf.work.WorkID;
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
