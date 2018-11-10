package app.java.parser.dao.element.leaf.record;

import app.java.parser.model.element.leaf.record.RecordType;
import org.w3c.dom.Node;

public interface RecordTypeDAO {
	/**
	 *
	 * @param node <b>lido:recordType</b> node type.
	 * @return <b>RecordType</b>
	 */
	RecordType getRecordType(Node node);
}
