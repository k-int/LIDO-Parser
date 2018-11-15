package ro.webdata.lido.parser.core.complex.dateSetComplexType;

import org.w3c.dom.Node;

public interface DateSetComplexTypeDAO {
	/**
	 *
	 * @param node <b>lido:dateSetComplexType</b> node type and.
	 * @return <b>DateSetComplexType</b>
	 */
	DateSetComplexType getDateSetComplexTypeParser(Node node);
}
