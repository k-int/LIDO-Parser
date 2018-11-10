package app.java.parser.dao.element.leaf.record;

import app.java.parser.model.element.leaf.record.RecordInfoLink;
import org.w3c.dom.Node;

public interface RecordInfoLinkDAO {
	/**
	 *
	 * @param node <b>lido:recordInfoLink</b> node type.
	 * @return <b>RecordInfoLink</b>
	 */
	RecordInfoLink getRecordInfoLink(Node node);
}
