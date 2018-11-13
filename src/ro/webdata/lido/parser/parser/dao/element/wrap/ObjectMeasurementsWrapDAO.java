package ro.webdata.lido.parser.parser.dao.element.wrap;

import ro.webdata.lido.parser.parser.model.element.wrap.ObjectMeasurementsWrap;
import org.w3c.dom.Node;

public interface ObjectMeasurementsWrapDAO {
	/**
	 *
	 * @param node <b>lido:objectMeasurementsWrap</b> node type.
	 * @return <b>ObjectMeasurementsWrap</b>
	 */
	ObjectMeasurementsWrap getObjectMeasurementsWrap(Node node);
}
