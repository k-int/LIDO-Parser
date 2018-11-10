package app.java.parser.dao.impl.element.leaf;

import app.java.parser.dao.complex.AdministrativeMetadataComplexTypeDAO;
import app.java.parser.dao.element.leaf.AdministrativeMetadataDAO;
import app.java.parser.dao.impl.complex.AdministrativeMetadataComplexTypeDAOImpl;
import app.java.parser.model.element.leaf.AdministrativeMetadata;
import org.w3c.dom.Node;

public class AdministrativeMetadataDAOImpl implements AdministrativeMetadataDAO {
    private AdministrativeMetadataComplexTypeDAO administrativeMetadataComplexTypeDAO = new AdministrativeMetadataComplexTypeDAOImpl();

    public AdministrativeMetadata getAdministrativeMetadata(Node node) {
        return new AdministrativeMetadata(
                administrativeMetadataComplexTypeDAO.getAdministrativeMetadataComplexType(node)
        );
    }
}
