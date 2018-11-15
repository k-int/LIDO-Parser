package ro.webdata.lido.parser.core.leaf.descriptiveMetadata;

import ro.webdata.lido.parser.core.complex.descriptiveMetadataComplexType.DescriptiveMetadataComplexTypeDAO;
import ro.webdata.lido.parser.core.complex.descriptiveMetadataComplexType.DescriptiveMetadataComplexTypeDAOImpl;
import org.w3c.dom.Node;

public class DescriptiveMetadataDAOImpl implements DescriptiveMetadataDAO {
    private static DescriptiveMetadataComplexTypeDAO descriptiveMetadataComplexTypeDAO = new DescriptiveMetadataComplexTypeDAOImpl();

    public DescriptiveMetadata getDescriptiveMetadata(Node node) {
        return new DescriptiveMetadata(descriptiveMetadataComplexTypeDAO.getDescriptiveMetadataComplexType(node));
    }
}
