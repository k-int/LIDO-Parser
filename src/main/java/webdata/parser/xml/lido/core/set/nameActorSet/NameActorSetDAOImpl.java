package webdata.parser.xml.lido.core.set.nameActorSet;

import org.w3c.dom.Node;
import ro.webdata.parser.xml.lido.core.complex.appellationComplexType.AppellationComplexTypeDAO;
import ro.webdata.parser.xml.lido.core.complex.appellationComplexType.AppellationComplexTypeDAOImpl;

public class NameActorSetDAOImpl implements NameActorSetDAO {
    private AppellationComplexTypeDAO appellationComplexTypeDAO = new AppellationComplexTypeDAOImpl();

    public NameActorSet getNameActorSet(Node node) {
        return new NameActorSet(appellationComplexTypeDAO.getAppellationComplexType(node));
    }
}
