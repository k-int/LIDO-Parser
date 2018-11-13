package ro.webdata.lido.parser.parser.dao.element.leaf.record;

import ro.webdata.lido.parser.parser.model.element.leaf.record.RecordInfoID;
import org.w3c.dom.Node;

public interface RecordInfoIDDAO {
	/**
	 *
	 * @param node <b>lido:recordInfoID</b> node type.
	 * @return <b>RecordInfoID</b>
	 */
	RecordInfoID getRecordInfoID(Node node);
}
