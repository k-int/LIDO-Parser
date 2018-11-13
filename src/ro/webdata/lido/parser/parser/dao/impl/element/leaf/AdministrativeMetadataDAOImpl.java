package ro.webdata.lido.parser.parser.dao.impl.element.leaf;

import ro.webdata.lido.parser.parser.dao.complex.AdministrativeMetadataComplexTypeDAO;
import ro.webdata.lido.parser.parser.dao.element.leaf.AdministrativeMetadataDAO;
import ro.webdata.lido.parser.parser.dao.impl.complex.AdministrativeMetadataComplexTypeDAOImpl;
import ro.webdata.lido.parser.parser.model.element.leaf.AdministrativeMetadata;
import org.w3c.dom.Node;

public class AdministrativeMetadataDAOImpl implements AdministrativeMetadataDAO {
    private AdministrativeMetadataComplexTypeDAO administrativeMetadataComplexTypeDAO = new AdministrativeMetadataComplexTypeDAOImpl();

    public AdministrativeMetadata getAdministrativeMetadata(Node node) {
        return new AdministrativeMetadata(
                administrativeMetadataComplexTypeDAO.getAdministrativeMetadataComplexType(node)
        );
    }
}
