package ro.webdata.lido.parser.parser.dao.impl.element.leaf.actor;

import ro.webdata.lido.parser.common.Utils;
import ro.webdata.lido.parser.parser.dao.complex.ConceptComplexTypeDAO;
import ro.webdata.lido.parser.parser.dao.element.leaf.actor.RoleActorDAO;
import ro.webdata.lido.parser.parser.dao.impl.complex.ConceptComplexTypeDAOImpl;
import ro.webdata.lido.parser.parser.model.attribute.lido.LidoSortOrder;
import ro.webdata.lido.parser.parser.model.element.leaf.actor.RoleActor;
import org.w3c.dom.Node;

import java.util.HashMap;

public class RoleActorDAOImpl implements RoleActorDAO {
    private static ConceptComplexTypeDAO conceptComplexTypeDAO = new ConceptComplexTypeDAOImpl();
    private static Utils utils = new Utils();

    public RoleActor getRoleActor(Node node) {
        HashMap<String, String> attributes = utils.getAttributes(node);

        return new RoleActor(
                conceptComplexTypeDAO.getConceptComplexType(node),
                new LidoSortOrder(attributes.get("lido:sortorder"))
        );
    }
}
