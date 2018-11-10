package app.java.parser.dao.element.leaf.record;

import app.java.parser.model.element.leaf.record.RecordMetadataDate;
import org.w3c.dom.Node;

public interface RecordMetadataDateDAO {
	/**
	 *
	 * @param node <b>lido:recordMetadataDate</b> node typoe.
	 * @return <b>RecordMetadataDate</b>
	 */
	RecordMetadataDate getRecordMetadataDate(Node node);
}
