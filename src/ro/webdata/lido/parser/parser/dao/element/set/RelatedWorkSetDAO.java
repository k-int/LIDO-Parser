package ro.webdata.lido.parser.parser.dao.element.set;

import ro.webdata.lido.parser.parser.model.element.set.RelatedWorkSet;
import org.w3c.dom.Node;

public interface RelatedWorkSetDAO {
    /**
     *
     * @param node <b>lido:relatedWorkSet</b> node type.
     * @return <b>RelatedWorkSet</b>
     */
    RelatedWorkSet getRelatedWorkSet(Node node);
}
