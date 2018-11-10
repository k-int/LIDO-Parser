package app.java.parser.dao.impl.element.leaf;

import app.java.parser.dao.complex.DescriptiveMetadataComplexTypeDAO;
import app.java.parser.dao.element.leaf.DescriptiveMetadataDAO;
import app.java.parser.dao.impl.complex.DescriptiveMetadataComplexTypeDAOImpl;
import app.java.parser.model.element.leaf.DescriptiveMetadata;
import org.w3c.dom.Node;

public class DescriptiveMetadataDAOImpl implements DescriptiveMetadataDAO {
    private static DescriptiveMetadataComplexTypeDAO descriptiveMetadataComplexTypeDAO = new DescriptiveMetadataComplexTypeDAOImpl();

    public DescriptiveMetadata getDescriptiveMetadata(Node node) {
        return new DescriptiveMetadata(descriptiveMetadataComplexTypeDAO.getDescriptiveMetadataComplexType(node));
    }
}
