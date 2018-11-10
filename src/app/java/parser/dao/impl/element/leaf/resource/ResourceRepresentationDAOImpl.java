package app.java.parser.dao.impl.element.leaf.resource;

import app.java.common.Utils;
import app.java.parser.dao.element.leaf.LinkResourceDAO;
import app.java.parser.dao.element.leaf.resource.ResourceRepresentationDAO;
import app.java.parser.dao.element.set.ResourceMeasurementsSetDAO;
import app.java.parser.dao.impl.element.leaf.LinkResourceDAOImpl;
import app.java.parser.dao.impl.element.set.ResourceMeasurementsSetDAOImpl;
import app.java.parser.model.attribute.lido.LidoType;
import app.java.parser.model.complex.MeasurementsSetComplexType;
import app.java.parser.model.element.leaf.LinkResource;
import app.java.parser.model.element.leaf.resource.ResourceRepresentation;
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
