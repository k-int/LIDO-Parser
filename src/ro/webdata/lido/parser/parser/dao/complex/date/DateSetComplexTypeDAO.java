package ro.webdata.lido.parser.parser.dao.complex.date;

import ro.webdata.lido.parser.parser.model.complex.date.DateSetComplexType;
import org.w3c.dom.Node;

public interface DateSetComplexTypeDAO {
	/**
	 *
	 * @param node <b>lido:dateSetComplexType</b> node type and.
	 * @return <b>DateSetComplexType</b>
	 */
	DateSetComplexType getDateSetComplexTypeParser(Node node);
}
