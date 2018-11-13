package ro.webdata.lido.parser.parser.dao.element.leaf.record;

import ro.webdata.lido.parser.parser.model.element.leaf.record.RecordRights;
import org.w3c.dom.Node;

public interface RecordRightsDAO {
	/**
	 *
	 * @param node <b>lido:recordRights</b> node type.
	 * @return <b>RecordRights</b>
	 */
	RecordRights getRecordRights(Node node);
}
