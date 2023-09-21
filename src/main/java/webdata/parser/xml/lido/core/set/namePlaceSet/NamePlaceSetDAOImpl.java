package webdata.parser.xml.lido.core.set.namePlaceSet;

import org.w3c.dom.Node;
import ro.webdata.parser.xml.lido.core.complex.appellationComplexType.AppellationComplexTypeDAO;
import ro.webdata.parser.xml.lido.core.complex.appellationComplexType.AppellationComplexTypeDAOImpl;

public class NamePlaceSetDAOImpl implements NamePlaceSetDAO {
    private AppellationComplexTypeDAO appellationComplexTypeDAO = new AppellationComplexTypeDAOImpl();

    public NamePlaceSet getNamePlaceSet(Node node) {
        return new NamePlaceSet(appellationComplexTypeDAO.getAppellationComplexType(node));
    }
}
