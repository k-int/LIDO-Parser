package app.java.parser.dao.element.leaf.record;

import app.java.parser.model.element.leaf.record.RecordRights;
import org.w3c.dom.Node;

public interface RecordRightsDAO {
	/**
	 *
	 * @param node <b>lido:recordRights</b> node type.
	 * @return <b>RecordRights</b>
	 */
	RecordRights getRecordRights(Node node);
}
