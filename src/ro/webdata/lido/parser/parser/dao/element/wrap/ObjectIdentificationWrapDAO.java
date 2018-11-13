package ro.webdata.lido.parser.parser.dao.element.wrap;

import ro.webdata.lido.parser.parser.model.element.wrap.ObjectIdentificationWrap;
import org.w3c.dom.Node;

public interface ObjectIdentificationWrapDAO {
    /**
     *
     * @param node <b>lido:objectIdentificationWrap</b> node type.
     * @return <b>ObjectIdentificationWrap</b>
     */
    ObjectIdentificationWrap getObjectIdentificationWrap(Node node);
}
