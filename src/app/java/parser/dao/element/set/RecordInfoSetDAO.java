package app.java.parser.dao.element.set;

import app.java.parser.model.element.set.RecordInfoSet;
import org.w3c.dom.Node;

public interface RecordInfoSetDAO {
	/**
	 *
	 * @param node <b>lido:recordRights</b> node type.
	 * @return <b>RecordInfoSet</b>
	 */
	RecordInfoSet getRecordInfoSet(Node node);
}
