package ro.webdata.lido.parser.core.leaf.resourceRepresentation;

import ro.webdata.lido.parser.common.Utils;
import ro.webdata.lido.parser.core.leaf.linkResource.LinkResourceDAO;
import ro.webdata.lido.parser.core.set.resourceMeasurementsSet.ResourceMeasurementsSetDAO;
import ro.webdata.lido.parser.core.leaf.linkResource.LinkResourceDAOImpl;
import ro.webdata.lido.parser.core.set.resourceMeasurementsSet.ResourceMeasurementsSetDAOImpl;
import ro.webdata.lido.parser.core.attribute.LidoType;
import ro.webdata.lido.parser.core.complex.measurementsSetComplexType.MeasurementsSetComplexType;
import ro.webdata.lido.parser.core.leaf.linkResource.LinkResource;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import java.util.ArrayList;
import java.util.HashMap;

public class ResourceRepresentationDAOImpl implements ResourceRepresentationDAO {
    private static LinkResourceDAO linkParser = new LinkResourceDAOImpl();
    private static ResourceMeasurementsSetDAO measureSetParser = new ResourceMeasurementsSetDAOImpl();
    private static Utils utils = new Utils();

    //TODO: create the ResourceRepresentationCompelexTypeDAO (artificial class) to extend the class
    public ResourceRepresentation getResourceRepresentation(Node node) {
        LinkResource linkResource = null;
        ArrayList<MeasurementsSetComplexType> resourceMeasurementsSet = new ArrayList<MeasurementsSetComplexType>();
        HashMap<String, String> attributes = utils.getAttributes(node);

        NodeList childNodeList = node.getChildNodes();
        for (int i = 0; i < childNodeList.getLength(); i++) {
            Node child = childNodeList.item(i);
            String childName = child.getNodeName();

            switch (childName) {
                case "lido:linkResource":
                    linkResource = linkParser.getLinkResource(child);
                    break;
                case "lido:resourceMeasurementsSet":
                    resourceMeasurementsSet.add(measureSetParser.getResourceMeasurementsSet(child));
                    break;
                default: break;
            }
        }

        return new ResourceRepresentation(
                linkResource,
                resourceMeasurementsSet,
                new LidoType(attributes.get("lido:type"))
        );
    }
}
