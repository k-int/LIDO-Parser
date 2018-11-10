package app.java.parser.dao.impl.complex;

import app.java.parser.dao.complex.MeasurementsSetComplexTypeDAO;
import app.java.parser.dao.element.leaf.measurements.MeasurementTypeDAO;
import app.java.parser.dao.element.leaf.measurements.MeasurementUnitDAO;
import app.java.parser.dao.element.leaf.measurements.MeasurementValueDAO;
import app.java.parser.dao.impl.element.leaf.measurements.MeasurementTypeDAOImpl;
import app.java.parser.dao.impl.element.leaf.measurements.MeasurementUnitDAOImpl;
import app.java.parser.dao.impl.element.leaf.measurements.MeasurementValueDAOImpl;
import app.java.parser.model.complex.MeasurementsSetComplexType;
import app.java.parser.model.element.leaf.measurements.MeasurementType;
import app.java.parser.model.element.leaf.measurements.MeasurementUnit;
import app.java.parser.model.element.leaf.measurements.MeasurementValue;
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
