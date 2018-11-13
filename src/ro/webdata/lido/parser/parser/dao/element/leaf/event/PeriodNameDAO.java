package ro.webdata.lido.parser.parser.dao.element.leaf.event;

import ro.webdata.lido.parser.parser.model.element.leaf.event.PeriodName;
import org.w3c.dom.Node;

public interface PeriodNameDAO {
	/**
	 *
	 * @param node <b>lido:periodName</b> node type.
	 * @return <b>PeriodName</b>
	 */
	PeriodName getPeriodName(Node node);
}
