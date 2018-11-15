package ro.webdata.lido.parser.core.wrap.objectWorkTypeWrap;

import org.w3c.dom.Node;

public interface ObjectWorkTypeWrapDAO {
	/**
	 *
	 * @param node <b>lido:objectWorkTypeWrap</b> node type.
	 * @return <b>ObjectWorkTypeWrap</b>
	 */
	ObjectWorkTypeWrap getObjectWorkTypeWrap(Node node);
}
