package ro.webdata.lido.parser.core.complex.resourceSetComplexType;

import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import ro.webdata.lido.parser.core.leaf.rightsResource.RightsResourceDAO;
import ro.webdata.lido.parser.core.leaf.rightsResource.RightsResourceDAOImpl;
import ro.webdata.lido.parser.core.leaf.rightsResource.RightsResource;
import ro.webdata.lido.parser.core.leaf.resourceDateTaken.ResourceDateTaken;
import ro.webdata.lido.parser.core.leaf.resourceDateTaken.ResourceDateTakenDAO;
import ro.webdata.lido.parser.core.leaf.resourceDateTaken.ResourceDateTakenDAOImpl;
import ro.webdata.lido.parser.core.leaf.resourceDescription.ResourceDescription;
import ro.webdata.lido.parser.core.leaf.resourceDescription.ResourceDescriptionDAO;
import ro.webdata.lido.parser.core.leaf.resourceDescription.ResourceDescriptionDAOImpl;
import ro.webdata.lido.parser.core.leaf.resourceID.ResourceID;
import ro.webdata.lido.parser.core.leaf.resourceID.ResourceIDDAO;
import ro.webdata.lido.parser.core.leaf.resourceID.ResourceIDDAOImpl;
import ro.webdata.lido.parser.core.leaf.resourcePerspective.ResourcePerspective;
import ro.webdata.lido.parser.core.leaf.resourcePerspective.ResourcePerspectiveDAO;
import ro.webdata.lido.parser.core.leaf.resourcePerspective.ResourcePerspectiveDAOImpl;
import ro.webdata.lido.parser.core.leaf.resourceRelType.ResourceRelType;
import ro.webdata.lido.parser.core.leaf.resourceRelType.ResourceRelTypeDAO;
import ro.webdata.lido.parser.core.leaf.resourceRelType.ResourceRelTypeDAOImpl;
import ro.webdata.lido.parser.core.leaf.resourceRepresentation.ResourceRepresentation;
import ro.webdata.lido.parser.core.leaf.resourceRepresentation.ResourceRepresentationDAO;
import ro.webdata.lido.parser.core.leaf.resourceRepresentation.ResourceRepresentationDAOImpl;
import ro.webdata.lido.parser.core.leaf.resourceSource.ResourceSource;
import ro.webdata.lido.parser.core.leaf.resourceSource.ResourceSourceDAO;
import ro.webdata.lido.parser.core.leaf.resourceSource.ResourceSourceDAOImpl;
import ro.webdata.lido.parser.core.leaf.resourceType.ResourceType;
import ro.webdata.lido.parser.core.leaf.resourceType.ResourceTypeDAO;
import ro.webdata.lido.parser.core.leaf.resourceType.ResourceTypeDAOImpl;

import java.util.ArrayList;

public class ResourceSetComplexTypeDAOImpl implements ResourceSetComplexTypeDAO {
    private static ResourceIDDAO resourceIDParser = new ResourceIDDAOImpl();
    private static ResourceRepresentationDAO representationParser = new ResourceRepresentationDAOImpl();
    private static ResourceTypeDAO resourceTypeParser = new ResourceTypeDAOImpl();
    private static ResourceRelTypeDAO resourceRelTypeParser = new ResourceRelTypeDAOImpl();
    private static ResourcePerspectiveDAO resourcePerspectiveParser = new ResourcePerspectiveDAOImpl();
    private static ResourceDescriptionDAO resourceDescriptionParser = new ResourceDescriptionDAOImpl();
    private static ResourceDateTakenDAO resourceDateTakenParser = new ResourceDateTakenDAOImpl();
    private static ResourceSourceDAO resourceSourceParser = new ResourceSourceDAOImpl();
    private static RightsResourceDAO rightsResourceParser = new RightsResourceDAOImpl();

    public ResourceSetComplexType getResourceSetComplexType(Node node) {
        ResourceID resourceID = null;
        ArrayList<ResourceRepresentation> resourceRepresentationList = new ArrayList<ResourceRepresentation>();
        ResourceType resourceType = null;
        ArrayList<ResourceRelType> resourceRelTypeList = new ArrayList<ResourceRelType>();
        ArrayList<ResourcePerspective> resourcePerspectiveList = new ArrayList<ResourcePerspective>();
        ArrayList<ResourceDescription> resourceDescriptionListList = new ArrayList<ResourceDescription>();
        ResourceDateTaken resourceDateTaken = null;
        ArrayList<ResourceSource> resourceSourceList = new ArrayList<ResourceSource>();
        ArrayList<RightsResource> rightsResourceList = new ArrayList<RightsResource>();

        NodeList childNodeList = node.getChildNodes();
        for (int i = 0; i < childNodeList.getLength(); i++) {
            Node child = childNodeList.item(i);
            String childName = child.getNodeName();

            switch (childName) {
                case "lido:resourceID":
                    resourceID = resourceIDParser.getResourceID(child);
                    break;
                case "lido:resourceRepresentation":
                    resourceRepresentationList.add(representationParser.getResourceRepresentation(child));
                    break;
                case "lido:resourceType":
                    resourceType = resourceTypeParser.getResourceType(child);
                    break;
                case "lido:resourceRelType":
                    resourceRelTypeList.add(resourceRelTypeParser.getResourceRelType(child));
                    break;
                case "lido:resourcePerspective":
                    resourcePerspectiveList.add(resourcePerspectiveParser.getResourcePerspective(child));
                    break;
                case "lido:resourceDescription":
                    resourceDescriptionListList.add(resourceDescriptionParser.getResourceDescription(child));
                    break;
                case "lido:resourceDateTaken":
                    resourceDateTaken = resourceDateTakenParser.getDateSetComplexType(child);
                    break;
                case "lido:resourceSource":
                    resourceSourceList.add(resourceSourceParser.getResourceSource(child));
                    break;
                case "lido:rightsResource":
                    rightsResourceList.add(rightsResourceParser.getRightsResource(child));
                    break;
                default: break;
            }
        }

        return new ResourceSetComplexType(
                resourceID, resourceRepresentationList, resourceType,
                resourceRelTypeList, resourcePerspectiveList,
                resourceDescriptionListList, resourceDateTaken,
                resourceSourceList, rightsResourceList
        );
    }
}
