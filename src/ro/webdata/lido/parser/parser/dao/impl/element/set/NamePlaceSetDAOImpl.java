package ro.webdata.lido.parser.parser.dao.impl.element.set;

import ro.webdata.lido.parser.parser.dao.complex.AppellationComplexTypeDAO;
import ro.webdata.lido.parser.parser.dao.element.set.NamePlaceSetDAO;
import ro.webdata.lido.parser.parser.dao.impl.complex.AppellationComplexTypeDAOImpl;
import ro.webdata.lido.parser.parser.model.element.set.NamePlaceSet;
import org.w3c.dom.Node;

public class NamePlaceSetDAOImpl implements NamePlaceSetDAO {
    private AppellationComplexTypeDAO appellationComplexTypeDAO = new AppellationComplexTypeDAOImpl();

    public NamePlaceSet getNamePlaceSet(Node node) {
        return new NamePlaceSet(appellationComplexTypeDAO.getAppellationComplexType(node));
    }
}
