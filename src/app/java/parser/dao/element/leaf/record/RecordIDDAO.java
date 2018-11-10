package app.java.parser.dao.element.leaf.record;

import app.java.parser.model.element.leaf.record.RecordID;
import org.w3c.dom.Node;

public interface RecordIDDAO {
	/**
	 *
	 * @param node <b>lido:recordID</b> node type.
	 * @return <b>RecordID</b>
	 */
	RecordID getRecordID(Node node);
}
