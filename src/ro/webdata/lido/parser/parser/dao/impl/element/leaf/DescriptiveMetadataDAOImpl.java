package ro.webdata.lido.parser.parser.dao.impl.element.leaf;

import ro.webdata.lido.parser.parser.dao.complex.DescriptiveMetadataComplexTypeDAO;
import ro.webdata.lido.parser.parser.dao.element.leaf.DescriptiveMetadataDAO;
import ro.webdata.lido.parser.parser.dao.impl.complex.DescriptiveMetadataComplexTypeDAOImpl;
import ro.webdata.lido.parser.parser.model.element.leaf.DescriptiveMetadata;
import org.w3c.dom.Node;

public class DescriptiveMetadataDAOImpl implements DescriptiveMetadataDAO {
    private static DescriptiveMetadataComplexTypeDAO descriptiveMetadataComplexTypeDAO = new DescriptiveMetadataComplexTypeDAOImpl();

    public DescriptiveMetadata getDescriptiveMetadata(Node node) {
        return new DescriptiveMetadata(descriptiveMetadataComplexTypeDAO.getDescriptiveMetadataComplexType(node));
    }
}
