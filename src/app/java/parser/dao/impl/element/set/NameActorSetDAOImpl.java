package app.java.parser.dao.impl.element.set;

import app.java.parser.dao.complex.AppellationComplexTypeDAO;
import app.java.parser.dao.element.set.NameActorSetDAO;
import app.java.parser.dao.impl.complex.AppellationComplexTypeDAOImpl;
import app.java.parser.model.element.set.NameActorSet;
import org.w3c.dom.Node;

public class NameActorSetDAOImpl implements NameActorSetDAO {
    private AppellationComplexTypeDAO appellationComplexTypeDAO = new AppellationComplexTypeDAOImpl();

    public NameActorSet getNameActorSet(Node node) {
        return new NameActorSet(appellationComplexTypeDAO.getAppellationComplexType(node));
    }
}
