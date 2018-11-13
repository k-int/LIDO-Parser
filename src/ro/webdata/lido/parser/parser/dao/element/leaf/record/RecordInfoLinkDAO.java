package ro.webdata.lido.parser.parser.dao.element.leaf.record;

import ro.webdata.lido.parser.parser.model.element.leaf.record.RecordInfoLink;
import org.w3c.dom.Node;

public interface RecordInfoLinkDAO {
	/**
	 *
	 * @param node <b>lido:recordInfoLink</b> node type.
	 * @return <b>RecordInfoLink</b>
	 */
	RecordInfoLink getRecordInfoLink(Node node);
}
