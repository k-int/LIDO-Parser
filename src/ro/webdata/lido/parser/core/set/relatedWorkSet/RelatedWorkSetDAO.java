package ro.webdata.lido.parser.core.set.relatedWorkSet;

import org.w3c.dom.Node;

public interface RelatedWorkSetDAO {
    /**
     *
     * @param node <b>lido:relatedWorkSet</b> node type.
     * @return <b>RelatedWorkSet</b>
     */
    RelatedWorkSet getRelatedWorkSet(Node node);
}
