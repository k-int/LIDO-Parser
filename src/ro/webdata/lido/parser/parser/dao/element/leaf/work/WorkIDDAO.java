package ro.webdata.lido.parser.parser.dao.element.leaf.work;

import ro.webdata.lido.parser.parser.model.element.leaf.work.WorkID;
import org.w3c.dom.Node;

public interface WorkIDDAO {
	/**
	 *
	 * @param node <b>lido:WorkID</b> node type.
	 * @return <b>WorkID</b>
	 */
	WorkID getWorkID(Node node);
}
