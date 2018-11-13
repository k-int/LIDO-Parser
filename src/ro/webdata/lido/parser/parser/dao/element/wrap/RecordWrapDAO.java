package ro.webdata.lido.parser.parser.dao.element.wrap;

import ro.webdata.lido.parser.parser.model.element.wrap.RecordWrap;
import org.w3c.dom.Node;

public interface RecordWrapDAO {
	/**
	 *
	 * @param node <b>lido:recordWrap</b> node type.
	 * @return <b>RecordWrap</b>
	 */
	RecordWrap getRecordWrap(Node node);
}
