package ro.webdata.lido.parser.parser.dao.impl.element.set;

import ro.webdata.lido.parser.parser.dao.complex.AppellationComplexTypeDAO;
import ro.webdata.lido.parser.parser.dao.element.set.NameActorSetDAO;
import ro.webdata.lido.parser.parser.dao.impl.complex.AppellationComplexTypeDAOImpl;
import ro.webdata.lido.parser.parser.model.element.set.NameActorSet;
import org.w3c.dom.Node;

public class NameActorSetDAOImpl implements NameActorSetDAO {
    private AppellationComplexTypeDAO appellationComplexTypeDAO = new AppellationComplexTypeDAOImpl();

    public NameActorSet getNameActorSet(Node node) {
        return new NameActorSet(appellationComplexTypeDAO.getAppellationComplexType(node));
    }
}
