package webdata.parser.xml.lido.core.set.rightsWorkSet;

import org.w3c.dom.Node;
import ro.webdata.echo.commons.graph.Graph;
import ro.webdata.parser.xml.lido.core.attribute.LidoSortOrder;
import ro.webdata.parser.xml.lido.core.complex.rightsComplexType.RightsComplexTypeDAO;
import ro.webdata.parser.xml.lido.core.complex.rightsComplexType.RightsComplexTypeDAOImpl;

import java.util.HashMap;

public class RightsWorkSetDAOImpl implements RightsWorkSetDAO {
    private static RightsComplexTypeDAO rightsComplexTypeDAO = new RightsComplexTypeDAOImpl();

    public RightsWorkSet getRightsWorkSet(Node node) {
        HashMap<String, String> attributes = Graph.getAttributes(node);

        return new RightsWorkSet(
                rightsComplexTypeDAO.getRightsComplexType(node),
                new LidoSortOrder(attributes.get("lido:sortorder"))
        );
    }
}
