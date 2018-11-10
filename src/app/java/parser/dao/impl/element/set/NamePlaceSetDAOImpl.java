package app.java.parser.dao.impl.element.set;

import app.java.parser.dao.complex.AppellationComplexTypeDAO;
import app.java.parser.dao.element.set.NamePlaceSetDAO;
import app.java.parser.dao.impl.complex.AppellationComplexTypeDAOImpl;
import app.java.parser.model.element.set.NamePlaceSet;
import org.w3c.dom.Node;

public class NamePlaceSetDAOImpl implements NamePlaceSetDAO {
    private AppellationComplexTypeDAO appellationComplexTypeDAO = new AppellationComplexTypeDAOImpl();

    public NamePlaceSet getNamePlaceSet(Node node) {
        return new NamePlaceSet(appellationComplexTypeDAO.getAppellationComplexType(node));
    }
}
