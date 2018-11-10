package app.java.parser.dao.element.leaf.work;

import app.java.parser.model.element.leaf.work.WorkID;
import org.w3c.dom.Node;

public interface WorkIDDAO {
	/**
	 *
	 * @param node <b>lido:WorkID</b> node type.
	 * @return <b>WorkID</b>
	 */
	WorkID getWorkID(Node node);
}
