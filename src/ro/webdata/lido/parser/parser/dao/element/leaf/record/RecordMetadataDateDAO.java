package ro.webdata.lido.parser.parser.dao.element.leaf.record;

import ro.webdata.lido.parser.parser.model.element.leaf.record.RecordMetadataDate;
import org.w3c.dom.Node;

public interface RecordMetadataDateDAO {
	/**
	 *
	 * @param node <b>lido:recordMetadataDate</b> node typoe.
	 * @return <b>RecordMetadataDate</b>
	 */
	RecordMetadataDate getRecordMetadataDate(Node node);
}
