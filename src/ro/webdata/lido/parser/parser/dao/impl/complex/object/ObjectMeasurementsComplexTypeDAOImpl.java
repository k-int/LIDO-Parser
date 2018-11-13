package ro.webdata.lido.parser.parser.dao.impl.complex.object;

import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import ro.webdata.lido.parser.parser.dao.complex.object.ObjectMeasurementsComplexTypeDAO;
import ro.webdata.lido.parser.parser.dao.element.leaf.measurements.*;
import ro.webdata.lido.parser.parser.dao.element.set.MeasurementsSetDAO;
import ro.webdata.lido.parser.parser.dao.impl.element.leaf.measurements.*;
import ro.webdata.lido.parser.parser.dao.impl.element.set.MeasurementsSetDAOImpl;
import ro.webdata.lido.parser.parser.model.complex.object.ObjectMeasurementsComplexType;
import ro.webdata.lido.parser.parser.model.element.leaf.measurements.*;
import ro.webdata.lido.parser.parser.model.element.set.MeasurementsSet;

import java.util.ArrayList;

public class ObjectMeasurementsComplexTypeDAOImpl implements ObjectMeasurementsComplexTypeDAO {
    private static MeasurementsSetDAO measurementsSetParser = new MeasurementsSetDAOImpl();
    private static ExtentMeasurementsDAO extentMeasurementsParser = new ExtentMeasurementsDAOImpl();
    private static QualifierMeasurementsDAO qualifierMeasurementsParser = new QualifierMeasurementsDAOImpl();
    private static FormatMeasurementsDAO formatMeasurementsParser = new FormatMeasurementsDAOImpl();
    private static ShapeMeasurementsDAO shapeMeasurementsParser = new ShapeMeasurementsDAOImpl();
    private static ScaleMeasurementsDAO scaleMeasurementsParser = new ScaleMeasurementsDAOImpl();

    public ObjectMeasurementsComplexType getObjectMeasurementsComplexType(Node node) {
        ArrayList<MeasurementsSet> measurementsSetList = new ArrayList<MeasurementsSet>();
        ArrayList<ExtentMeasurements> extentMeasurementsList = new ArrayList<ExtentMeasurements>();
        ArrayList<QualifierMeasurements> qualifierMeasurementsList = new ArrayList<QualifierMeasurements>();
        ArrayList<FormatMeasurements> formatMeasurementsList = new ArrayList<FormatMeasurements>();
        ArrayList<ShapeMeasurements> shapeMeasurementsList = new ArrayList<ShapeMeasurements>();
        ArrayList<ScaleMeasurements> scaleMeasurementsList = new ArrayList<ScaleMeasurements>();

        NodeList childNodeList = node.getChildNodes();
        for (int i = 0; i < childNodeList.getLength(); i++) {
            Node child = childNodeList.item(i);
            String childName = child.getNodeName();

            switch (childName) {
                case "lido:measurementsSet":
                    measurementsSetList.add(measurementsSetParser.getMeasurementsSet(child));
                    break;
                case "lido:extentMeasurements":
                    extentMeasurementsList.add(extentMeasurementsParser.getExtentMeasurements(child));
                    break;
                case "lido:qualifierMeasurements":
                    qualifierMeasurementsList.add(qualifierMeasurementsParser.getQualifierMeasurements(child));
                    break;
                case "lido:formatMeasurements":
                    formatMeasurementsList.add(formatMeasurementsParser.getFormatMeasurements(child));
                    break;
                case "lido:shapeMeasurements":
                    shapeMeasurementsList.add(shapeMeasurementsParser.getShapeMeasurements(child));
                    break;
                case "lido:scaleMeasurements":
                    scaleMeasurementsList.add(scaleMeasurementsParser.getScaleMeasurements(child));
                    break;
                default: break;
            }
        }

        return new ObjectMeasurementsComplexType(
                measurementsSetList,
                extentMeasurementsList,
                qualifierMeasurementsList,
                formatMeasurementsList,
                shapeMeasurementsList,
                scaleMeasurementsList
        );
    }
}
