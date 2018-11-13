package ro.webdata.lido.parser.parser.dao.element.leaf.record;

import ro.webdata.lido.parser.parser.model.element.leaf.record.RecordSource;
import org.w3c.dom.Node;

public interface RecordSourceDAO {
	/**
	 *
	 * @param node <b>lido:recordSource</b> node type.
	 * @return <b>RecordSource</b>
	 */
	RecordSource getRecordSourceType(Node node);
}
