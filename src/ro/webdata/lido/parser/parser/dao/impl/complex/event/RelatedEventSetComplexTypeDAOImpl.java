package ro.webdata.lido.parser.parser.dao.impl.complex.event;

import ro.webdata.lido.parser.parser.dao.complex.event.RelatedEventSetComplexTypeDAO;
import ro.webdata.lido.parser.parser.dao.element.leaf.event.RelatedEventDAO;
import ro.webdata.lido.parser.parser.dao.element.leaf.event.RelatedEventRelTypeDAO;
import ro.webdata.lido.parser.parser.dao.impl.element.leaf.event.RelatedEventDAOImpl;
import ro.webdata.lido.parser.parser.dao.impl.element.leaf.event.RelatedEventRelTypeDAOImpl;
import ro.webdata.lido.parser.parser.model.complex.event.RelatedEventSetComplexType;
import ro.webdata.lido.parser.parser.model.element.leaf.event.RelatedEvent;
import ro.webdata.lido.parser.parser.model.element.leaf.event.RelatedEventRelType;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

public class RelatedEventSetComplexTypeDAOImpl implements RelatedEventSetComplexTypeDAO {
    private static RelatedEventDAO relatedEventParser = new RelatedEventDAOImpl();
    private static RelatedEventRelTypeDAO relatedEventRelTypeParser = new RelatedEventRelTypeDAOImpl();

    public RelatedEventSetComplexType getRelatedEventSetComplexType(Node node) {
        RelatedEvent relatedEvent = null;
        RelatedEventRelType relatedEventRelType = null;

        NodeList childNodeList = node.getChildNodes();
        for (int i = 0; i < childNodeList.getLength(); i++) {
            Node child = childNodeList.item(i);
            String childName = child.getNodeName();

            switch (childName) {
                case "lido:relatedEvent":
                    relatedEvent = relatedEventParser.getRelatedEvent(child);
                    break;
                case "lido:relatedEventRelType":
                    relatedEventRelType = relatedEventRelTypeParser.getRelatedEventRelType(child);
                    break;
                default: break;
            }
        }

        return new RelatedEventSetComplexType(relatedEvent, relatedEventRelType);
    }
}
