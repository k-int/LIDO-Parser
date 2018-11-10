package app.java.parser.dao.impl.element.leaf.actor;

import app.java.parser.dao.complex.date.DateComplexTypeDAO;
import app.java.parser.dao.element.leaf.actor.VitalDatesActorDAO;
import app.java.parser.dao.impl.complex.date.DateComplexTypeDAOImpl;
import app.java.parser.model.element.leaf.actor.VitalDatesActor;
import org.w3c.dom.Node;

public class VitalDatesActorDAOImpl implements VitalDatesActorDAO {
    private static DateComplexTypeDAO dateComplexTypeDAO = new DateComplexTypeDAOImpl();

    public VitalDatesActor getVitalDatesActor(Node node) {
        return new VitalDatesActor(dateComplexTypeDAO.getDateComplexType(node));
    }
}
