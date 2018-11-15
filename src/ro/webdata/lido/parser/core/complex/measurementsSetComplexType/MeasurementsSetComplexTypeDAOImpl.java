package ro.webdata.lido.parser.core.complex.measurementsSetComplexType;

import ro.webdata.lido.parser.core.leaf.measurementType.MeasurementTypeDAO;
import ro.webdata.lido.parser.core.leaf.measurementUnit.MeasurementUnitDAO;
import ro.webdata.lido.parser.core.leaf.measurementValue.MeasurementValueDAO;
import ro.webdata.lido.parser.core.leaf.measurementType.MeasurementTypeDAOImpl;
import ro.webdata.lido.parser.core.leaf.measurementUnit.MeasurementUnitDAOImpl;
import ro.webdata.lido.parser.core.leaf.measurementValue.MeasurementValueDAOImpl;
import ro.webdata.lido.parser.core.leaf.measurementType.MeasurementType;
import ro.webdata.lido.parser.core.leaf.measurementUnit.MeasurementUnit;
import ro.webdata.lido.parser.core.leaf.measurementValue.MeasurementValue;
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