package ro.webdata.lido.parser.core.leaf.legalBodyName;

import ro.webdata.lido.parser.core.complex.appellationComplexType.AppellationComplexTypeDAO;
import ro.webdata.lido.parser.core.complex.appellationComplexType.AppellationComplexTypeDAOImpl;
import org.w3c.dom.Node;

public class LegalBodyNameDAOImpl implements LegalBodyNameDAO {
    private static AppellationComplexTypeDAO appellationComplexTypeDAO = new AppellationComplexTypeDAOImpl();

    public LegalBodyName getLegalBodyName(Node node) {
        return new LegalBodyName(appellationComplexTypeDAO.getAppellationComplexType(node));
    }
}
