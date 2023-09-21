package webdata.parser.xml.lido.core.leaf.vitalDatesActor;

import org.w3c.dom.Node;
import ro.webdata.parser.xml.lido.core.complex.dateComplexType.DateComplexTypeDAO;
import ro.webdata.parser.xml.lido.core.complex.dateComplexType.DateComplexTypeDAOImpl;

public class VitalDatesActorDAOImpl implements VitalDatesActorDAO {
    private static DateComplexTypeDAO dateComplexTypeDAO = new DateComplexTypeDAOImpl();

    public VitalDatesActor getVitalDatesActor(Node node) {
        return new VitalDatesActor(dateComplexTypeDAO.getDateComplexType(node));
    }
}
