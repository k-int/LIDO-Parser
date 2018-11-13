package ro.webdata.lido.parser.parser.dao.element.leaf.measurements;

import ro.webdata.lido.parser.parser.model.element.leaf.measurements.FormatMeasurements;
import org.w3c.dom.Node;

public interface FormatMeasurementsDAO {
    /**
     *
     * @param node <b>lido:formatMeasurements</b> node type.
     * @return <b>FormatMeasurements</b>
     */
    FormatMeasurements getFormatMeasurements(Node node);
}
