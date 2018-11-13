package ro.webdata.lido.parser.parser.dao.impl.element.leaf.actor;

import ro.webdata.lido.parser.parser.dao.complex.date.DateComplexTypeDAO;
import ro.webdata.lido.parser.parser.dao.element.leaf.actor.VitalDatesActorDAO;
import ro.webdata.lido.parser.parser.dao.impl.complex.date.DateComplexTypeDAOImpl;
import ro.webdata.lido.parser.parser.model.element.leaf.actor.VitalDatesActor;
import org.w3c.dom.Node;

public class VitalDatesActorDAOImpl implements VitalDatesActorDAO {
    private static DateComplexTypeDAO dateComplexTypeDAO = new DateComplexTypeDAOImpl();

    public VitalDatesActor getVitalDatesActor(Node node) {
        return new VitalDatesActor(dateComplexTypeDAO.getDateComplexType(node));
    }
}
