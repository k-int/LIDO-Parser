package app.java.parser.dao.impl.element.leaf.legalBody;

import app.java.parser.dao.complex.AppellationComplexTypeDAO;
import app.java.parser.dao.element.leaf.legalBody.LegalBodyNameDAO;
import app.java.parser.dao.impl.complex.AppellationComplexTypeDAOImpl;
import app.java.parser.model.element.leaf.legalBody.LegalBodyName;
import org.w3c.dom.Node;

public class LegalBodyNameDAOImpl implements LegalBodyNameDAO {
    private static AppellationComplexTypeDAO appellationComplexTypeDAO = new AppellationComplexTypeDAOImpl();

    public LegalBodyName getLegalBodyName(Node node) {
        return new LegalBodyName(appellationComplexTypeDAO.getAppellationComplexType(node));
    }
}
