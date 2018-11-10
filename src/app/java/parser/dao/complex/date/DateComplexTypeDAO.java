package app.java.parser.dao.complex.date;

import app.java.parser.model.complex.date.DateComplexType;
import org.w3c.dom.Node;

public interface DateComplexTypeDAO {
	/**
	 *
	 * @param node <b>lido:rightsDate</b> node type.
	 * @return <b>DateComplexType</b>
	 */
	DateComplexType getDateComplexType(Node node);
}
