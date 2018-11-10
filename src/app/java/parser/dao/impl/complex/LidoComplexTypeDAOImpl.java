package app.java.parser.dao.impl.complex;

import app.java.common.Utils;
import app.java.parser.dao.complex.LidoComplexTypeDAO;
import app.java.parser.dao.element.leaf.AdministrativeMetadataDAO;
import app.java.parser.dao.element.leaf.CategoryDAO;
import app.java.parser.dao.element.leaf.DescriptiveMetadataDAO;
import app.java.parser.dao.element.leaf.LidoRecIDDAO;
import app.java.parser.dao.element.leaf.object.ObjectPublishedIDDAO;
import app.java.parser.dao.impl.element.leaf.AdministrativeMetadataDAOImpl;
import app.java.parser.dao.impl.element.leaf.CategoryDAOImpl;
import app.java.parser.dao.impl.element.leaf.DescriptiveMetadataDAOImpl;
import app.java.parser.dao.impl.element.leaf.LidoRecIDDAOImpl;
import app.java.parser.dao.impl.element.leaf.object.ObjectPublishedIDDAOImpl;
import app.java.parser.model.attribute.lido.LidoRelatedEncoding;
import app.java.parser.model.complex.LidoComplexType;
import app.java.parser.model.element.leaf.AdministrativeMetadata;
import app.java.parser.model.element.leaf.Category;
import app.java.parser.model.element.leaf.DescriptiveMetadata;
import app.java.parser.model.element.leaf.LidoRecID;
import app.java.parser.model.element.leaf.object.ObjectPublishedID;
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
