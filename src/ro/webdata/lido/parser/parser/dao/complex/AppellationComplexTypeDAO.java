package ro.webdata.lido.parser.parser.dao.complex;

import ro.webdata.lido.parser.parser.model.complex.AppellationComplexType;
import org.w3c.dom.Node;

public interface AppellationComplexTypeDAO {
	/**
	 *
	 * @param node <b>lido:appellationComplexType</b> node type.
	 * @return <b>AppellationComplexType</b>
	 */
	AppellationComplexType getAppellationComplexType(Node node);
}