package app.java.parser.dao.impl.element.leaf.subject;

import app.java.common.Utils;
import app.java.parser.dao.complex.actor.ActorSetComplexTypeDAO;
import app.java.parser.dao.element.leaf.subject.SubjectActorDAO;
import app.java.parser.dao.impl.complex.actor.ActorSetComplexTypeDAOImpl;
import app.java.parser.model.attribute.lido.LidoSortOrder;
import app.java.parser.model.element.leaf.subject.SubjectActor;
import org.w3c.dom.Node;

import java.util.HashMap;

public class SubjectActorDAOImpl implements SubjectActorDAO {
    private static ActorSetComplexTypeDAO actorSetComplexTypeDAO = new ActorSetComplexTypeDAOImpl();
    private static Utils utils = new Utils();

    public SubjectActor getSubjectActor(Node node) {
        HashMap<String, String> attributes = utils.getAttributes(node);

        return new SubjectActor(
                actorSetComplexTypeDAO.getActorSetComplexType(node),
                new LidoSortOrder(attributes.get("lido:sortorder"))
        );
    }
}
