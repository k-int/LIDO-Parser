package ro.webdata.lido.parser.parser.dao.element.set;

import ro.webdata.lido.parser.parser.model.element.set.RecordInfoSet;
import org.w3c.dom.Node;

public interface RecordInfoSetDAO {
	/**
	 *
	 * @param node <b>lido:recordRights</b> node type.
	 * @return <b>RecordInfoSet</b>
	 */
	RecordInfoSet getRecordInfoSet(Node node);
}
