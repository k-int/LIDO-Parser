package ro.webdata.lido.parser.core.leaf.administrativeMetadata;

import ro.webdata.lido.parser.core.complex.administrativeMetadataComplexType.AdministrativeMetadataComplexTypeDAO;
import ro.webdata.lido.parser.core.complex.administrativeMetadataComplexType.AdministrativeMetadataComplexTypeDAOImpl;
import org.w3c.dom.Node;

public class AdministrativeMetadataDAOImpl implements AdministrativeMetadataDAO {
    private AdministrativeMetadataComplexTypeDAO administrativeMetadataComplexTypeDAO = new AdministrativeMetadataComplexTypeDAOImpl();

    public AdministrativeMetadata getAdministrativeMetadata(Node node) {
        return new AdministrativeMetadata(
                administrativeMetadataComplexTypeDAO.getAdministrativeMetadataComplexType(node)
        );
    }
}
