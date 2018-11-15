package ro.webdata.lido.parser.core.complex.lidoComplexType;

import ro.webdata.lido.parser.common.Utils;
import ro.webdata.lido.parser.core.leaf.administrativeMetadata.AdministrativeMetadataDAO;
import ro.webdata.lido.parser.core.leaf.category.CategoryDAO;
import ro.webdata.lido.parser.core.leaf.descriptiveMetadata.DescriptiveMetadataDAO;
import ro.webdata.lido.parser.core.leaf.lidoRecID.LidoRecIDDAO;
import ro.webdata.lido.parser.core.leaf.objectPublishedID.ObjectPublishedIDDAO;
import ro.webdata.lido.parser.core.leaf.administrativeMetadata.AdministrativeMetadataDAOImpl;
import ro.webdata.lido.parser.core.leaf.category.CategoryDAOImpl;
import ro.webdata.lido.parser.core.leaf.descriptiveMetadata.DescriptiveMetadataDAOImpl;
import ro.webdata.lido.parser.core.leaf.lidoRecID.LidoRecIDDAOImpl;
import ro.webdata.lido.parser.core.leaf.objectPublishedID.ObjectPublishedIDDAOImpl;
import ro.webdata.lido.parser.core.attribute.LidoRelatedEncoding;
import ro.webdata.lido.parser.core.leaf.administrativeMetadata.AdministrativeMetadata;
import ro.webdata.lido.parser.core.leaf.category.Category;
import ro.webdata.lido.parser.core.leaf.descriptiveMetadata.DescriptiveMetadata;
import ro.webdata.lido.parser.core.leaf.lidoRecID.LidoRecID;
import ro.webdata.lido.parser.core.leaf.objectPublishedID.ObjectPublishedID;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import java.util.ArrayList;
import java.util.HashMap;

public class LidoComplexTypeDAOImpl implements LidoComplexTypeDAO {
    private static LidoRecIDDAO lidoRecIDParser = new LidoRecIDDAOImpl();
    private static ObjectPublishedIDDAO objectPublishedIDParser = new ObjectPublishedIDDAOImpl();
    private static CategoryDAO categoryParser = new CategoryDAOImpl();
    private static DescriptiveMetadataDAO descriptiveMetadataParser = new DescriptiveMetadataDAOImpl();
    private static AdministrativeMetadataDAO administrativeMetadataParser = new AdministrativeMetadataDAOImpl();
    private static Utils utils = new Utils();

    public LidoComplexType getLidoComplexType(Node node) {
        ArrayList<LidoRecID> lidoRecIDList = new ArrayList<LidoRecID>();
        ArrayList<ObjectPublishedID> objectPublishedIDList = new ArrayList<ObjectPublishedID>();
        Category category = null;
        ArrayList<DescriptiveMetadata> descriptiveMetadataList = new ArrayList<DescriptiveMetadata>();
        ArrayList<AdministrativeMetadata> administrativeMetadataList = new ArrayList<AdministrativeMetadata>();
        HashMap<String, String> attributes = utils.getAttributes(node);

        NodeList childNodeList = node.getChildNodes();
        for (int i = 0; i < childNodeList.getLength(); i++) {
            Node child = childNodeList.item(i);
            String childName = child.getNodeName();

            switch (childName) {
                case "lido:lidoRecID":
                    lidoRecIDList.add(lidoRecIDParser.getLidoRecID(child));
                    break;
                case "lido:objectPublishedID":
                    objectPublishedIDList.add(objectPublishedIDParser.getObjectPublishedID(child));
                    break;
                case "lido:category":
                    category = categoryParser.getCategory(child);
                    break;
                case "lido:descriptiveMetadata":
                    descriptiveMetadataList.add(descriptiveMetadataParser.getDescriptiveMetadata(child));
                    break;
                case "lido:administrativeMetadata":
                    administrativeMetadataList.add(administrativeMetadataParser.getAdministrativeMetadata(child));
                    break;
                default: break;
            }
        }

        return new LidoComplexType(
                lidoRecIDList, objectPublishedIDList, category,
                descriptiveMetadataList, administrativeMetadataList,
                new LidoRelatedEncoding(attributes.get("lido:relatedencoding"))
        );
    }
}
