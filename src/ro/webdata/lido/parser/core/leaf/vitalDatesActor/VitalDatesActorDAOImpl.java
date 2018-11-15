package ro.webdata.lido.parser.core.leaf.vitalDatesActor;

import ro.webdata.lido.parser.core.complex.dateComplexType.DateComplexTypeDAO;
import ro.webdata.lido.parser.core.complex.dateComplexType.DateComplexTypeDAOImpl;
import org.w3c.dom.Node;

public class VitalDatesActorDAOImpl implements VitalDatesActorDAO {
    private static DateComplexTypeDAO dateComplexTypeDAO = new DateComplexTypeDAOImpl();

    public VitalDatesActor getVitalDatesActor(Node node) {
        return new VitalDatesActor(dateComplexTypeDAO.getDateComplexType(node));
    }
}
