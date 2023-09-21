package webdata.parser.xml.lido.core.leaf.administrativeMetadata;

import org.w3c.dom.Node;
import ro.webdata.parser.xml.lido.core.complex.administrativeMetadataComplexType.AdministrativeMetadataComplexTypeDAO;
import ro.webdata.parser.xml.lido.core.complex.administrativeMetadataComplexType.AdministrativeMetadataComplexTypeDAOImpl;

public class AdministrativeMetadataDAOImpl implements AdministrativeMetadataDAO {
    private AdministrativeMetadataComplexTypeDAO administrativeMetadataComplexTypeDAO = new AdministrativeMetadataComplexTypeDAOImpl();

    public AdministrativeMetadata getAdministrativeMetadata(Node node) {
        return new AdministrativeMetadata(
                administrativeMetadataComplexTypeDAO.getAdministrativeMetadataComplexType(node)
        );
    }
}
