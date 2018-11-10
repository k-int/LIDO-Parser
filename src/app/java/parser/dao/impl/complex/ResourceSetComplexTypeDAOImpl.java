package app.java.parser.dao.impl.complex;

import app.java.parser.dao.complex.ResourceSetComplexTypeDAO;
import app.java.parser.dao.element.leaf.resource.*;
import app.java.parser.dao.element.leaf.rights.RightsResourceDAO;
import app.java.parser.dao.impl.element.leaf.resource.*;
import app.java.parser.dao.impl.element.leaf.rights.RightsResourceDAOImpl;
import app.java.parser.model.complex.ResourceSetComplexType;
import app.java.parser.model.element.leaf.resource.*;
import app.java.parser.model.element.leaf.rights.RightsResource;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

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
