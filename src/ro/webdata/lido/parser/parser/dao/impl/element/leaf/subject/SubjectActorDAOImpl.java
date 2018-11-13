package ro.webdata.lido.parser.parser.dao.impl.element.leaf.subject;

import ro.webdata.lido.parser.common.Utils;
import ro.webdata.lido.parser.parser.dao.complex.actor.ActorSetComplexTypeDAO;
import ro.webdata.lido.parser.parser.dao.element.leaf.subject.SubjectActorDAO;
import ro.webdata.lido.parser.parser.dao.impl.complex.actor.ActorSetComplexTypeDAOImpl;
import ro.webdata.lido.parser.parser.model.attribute.lido.LidoSortOrder;
import ro.webdata.lido.parser.parser.model.element.leaf.subject.SubjectActor;
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
