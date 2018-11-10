package app.java.parser.dao.impl.element.leaf.actor;

import app.java.common.Utils;
import app.java.parser.dao.complex.ConceptComplexTypeDAO;
import app.java.parser.dao.element.leaf.actor.NationalityActorDAO;
import app.java.parser.dao.impl.complex.ConceptComplexTypeDAOImpl;
import app.java.parser.model.attribute.lido.LidoSortOrder;
import app.java.parser.model.element.leaf.actor.NationalityActor;
import org.w3c.dom.Node;

import java.util.HashMap;

public class NationalityActorDAOImpl implements NationalityActorDAO {
    private static ConceptComplexTypeDAO conceptComplexTypeDAO = new ConceptComplexTypeDAOImpl();
    private static Utils utils = new Utils();

    public NationalityActor getNationalityActor(Node node) {
        HashMap<String, String> attributes = utils.getAttributes(node);

        return new NationalityActor(
                conceptComplexTypeDAO.getConceptComplexType(node),
                new LidoSortOrder(attributes.get("lido:sortorder"))
        );
    }
}
