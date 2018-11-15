package ro.webdata.lido.parser.core.leaf.recordRights;

import org.w3c.dom.Node;

public interface RecordRightsDAO {
	/**
	 *
	 * @param node <b>lido:recordRights</b> node type.
	 * @return <b>RecordRights</b>
	 */
	RecordRights getRecordRights(Node node);
}
