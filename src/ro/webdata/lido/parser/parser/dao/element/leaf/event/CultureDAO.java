package ro.webdata.lido.parser.parser.dao.element.leaf.event;

import ro.webdata.lido.parser.parser.model.element.leaf.event.Culture;
import org.w3c.dom.Node;

public interface CultureDAO {
    /**
     *
     * @param node <b>lido:culture</b> node type.
     * @return <b>Culture</b>
     */
    Culture getCulture(Node node);
}
