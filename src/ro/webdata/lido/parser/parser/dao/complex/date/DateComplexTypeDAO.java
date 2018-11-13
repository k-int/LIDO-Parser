package ro.webdata.lido.parser.parser.dao.complex.date;

import ro.webdata.lido.parser.parser.model.complex.date.DateComplexType;
import org.w3c.dom.Node;

public interface DateComplexTypeDAO {
	/**
	 *
	 * @param node <b>lido:rightsDate</b> node type.
	 * @return <b>DateComplexType</b>
	 */
	DateComplexType getDateComplexType(Node node);
}
