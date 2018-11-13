package ro.webdata.lido.parser.parser.dao.element.leaf.record;

import ro.webdata.lido.parser.parser.model.element.leaf.record.RecordType;
import org.w3c.dom.Node;

public interface RecordTypeDAO {
	/**
	 *
	 * @param node <b>lido:recordType</b> node type.
	 * @return <b>RecordType</b>
	 */
	RecordType getRecordType(Node node);
}
