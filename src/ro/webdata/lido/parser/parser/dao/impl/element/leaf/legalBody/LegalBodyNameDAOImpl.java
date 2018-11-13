package ro.webdata.lido.parser.parser.dao.impl.element.leaf.legalBody;

import ro.webdata.lido.parser.parser.dao.complex.AppellationComplexTypeDAO;
import ro.webdata.lido.parser.parser.dao.element.leaf.legalBody.LegalBodyNameDAO;
import ro.webdata.lido.parser.parser.dao.impl.complex.AppellationComplexTypeDAOImpl;
import ro.webdata.lido.parser.parser.model.element.leaf.legalBody.LegalBodyName;
import org.w3c.dom.Node;

public class LegalBodyNameDAOImpl implements LegalBodyNameDAO {
    private static AppellationComplexTypeDAO appellationComplexTypeDAO = new AppellationComplexTypeDAOImpl();

    public LegalBodyName getLegalBodyName(Node node) {
        return new LegalBodyName(appellationComplexTypeDAO.getAppellationComplexType(node));
    }
}
