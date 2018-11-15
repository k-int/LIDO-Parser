package ro.webdata.lido.parser.core.set.nameActorSet;

import ro.webdata.lido.parser.core.complex.appellationComplexType.AppellationComplexTypeDAO;
import ro.webdata.lido.parser.core.complex.appellationComplexType.AppellationComplexTypeDAOImpl;
import org.w3c.dom.Node;

public class NameActorSetDAOImpl implements NameActorSetDAO {
    private AppellationComplexTypeDAO appellationComplexTypeDAO = new AppellationComplexTypeDAOImpl();

    public NameActorSet getNameActorSet(Node node) {
        return new NameActorSet(appellationComplexTypeDAO.getAppellationComplexType(node));
    }
}
