package ro.webdata.lido.parser.parser.dao.impl.element.leaf.actor;

import ro.webdata.lido.parser.common.Utils;
import ro.webdata.lido.parser.parser.dao.complex.ConceptComplexTypeDAO;
import ro.webdata.lido.parser.parser.dao.element.leaf.actor.NationalityActorDAO;
import ro.webdata.lido.parser.parser.dao.impl.complex.ConceptComplexTypeDAOImpl;
import ro.webdata.lido.parser.parser.model.attribute.lido.LidoSortOrder;
import ro.webdata.lido.parser.parser.model.element.leaf.actor.NationalityActor;
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
