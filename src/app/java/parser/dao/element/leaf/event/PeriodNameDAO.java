package app.java.parser.dao.element.leaf.event;

import app.java.parser.model.element.leaf.event.PeriodName;
import org.w3c.dom.Node;

public interface PeriodNameDAO {
	/**
	 *
	 * @param node <b>lido:periodName</b> node type.
	 * @return <b>PeriodName</b>
	 */
	PeriodName getPeriodName(Node node);
}
