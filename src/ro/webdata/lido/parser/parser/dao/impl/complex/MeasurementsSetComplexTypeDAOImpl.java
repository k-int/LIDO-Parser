package ro.webdata.lido.parser.parser.dao.impl.complex;

import ro.webdata.lido.parser.parser.dao.complex.MeasurementsSetComplexTypeDAO;
import ro.webdata.lido.parser.parser.dao.element.leaf.measurements.MeasurementTypeDAO;
import ro.webdata.lido.parser.parser.dao.element.leaf.measurements.MeasurementUnitDAO;
import ro.webdata.lido.parser.parser.dao.element.leaf.measurements.MeasurementValueDAO;
import ro.webdata.lido.parser.parser.dao.impl.element.leaf.measurements.MeasurementTypeDAOImpl;
import ro.webdata.lido.parser.parser.dao.impl.element.leaf.measurements.MeasurementUnitDAOImpl;
import ro.webdata.lido.parser.parser.dao.impl.element.leaf.measurements.MeasurementValueDAOImpl;
import ro.webdata.lido.parser.parser.model.complex.MeasurementsSetComplexType;
import ro.webdata.lido.parser.parser.model.element.leaf.measurements.MeasurementType;
import ro.webdata.lido.parser.parser.model.element.leaf.measurements.MeasurementUnit;
import ro.webdata.lido.parser.parser.model.element.leaf.measurements.MeasurementValue;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import java.util.ArrayList;

public class MeasurementsSetComplexTypeDAOImpl implements MeasurementsSetComplexTypeDAO {
    private static MeasurementTypeDAO measurementTypeParser = new MeasurementTypeDAOImpl();
    private static MeasurementUnitDAO measurementUnitParser = new MeasurementUnitDAOImpl();
    private static MeasurementValueDAO measurementValueParser = new MeasurementValueDAOImpl();

    public MeasurementsSetComplexType getMeasurementsSetComplexType(Node node) {
        ArrayList<MeasurementType> measurementTypeList = new ArrayList<MeasurementType>();
        ArrayList<MeasurementUnit> measurementUnitList = new ArrayList<MeasurementUnit>();
        MeasurementValue measurementValue = null;

        NodeList childNodeList = node.getChildNodes();
        for (int i = 0; i < childNodeList.getLength(); i++) {
            Node child = childNodeList.item(i);
            String childName = child.getNodeName();

            switch (childName) {
                case "lido:measurementType":
                    measurementTypeList.add(measurementTypeParser.getMeasurementType(child));
                    break;
                case "lido:measurementUnit":
                    measurementUnitList.add(measurementUnitParser.getMeasurementUnit(child));
                    break;
                case "lido:measurementValue":
                    measurementValue = measurementValueParser.getMeasurementValue(child);
                    break;
                default: break;
            }
        }

        return new MeasurementsSetComplexType(
                measurementTypeList, measurementUnitList, measurementValue
        );
    }
}
