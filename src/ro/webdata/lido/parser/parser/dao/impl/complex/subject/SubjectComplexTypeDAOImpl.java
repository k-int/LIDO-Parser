package ro.webdata.lido.parser.parser.dao.impl.complex.subject;

import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import ro.webdata.lido.parser.common.Utils;
import ro.webdata.lido.parser.parser.dao.complex.subject.SubjectComplexTypeDAO;
import ro.webdata.lido.parser.parser.dao.element.leaf.subject.*;
import ro.webdata.lido.parser.parser.dao.impl.element.leaf.subject.*;
import ro.webdata.lido.parser.parser.model.attribute.lido.LidoType;
import ro.webdata.lido.parser.parser.model.complex.subject.SubjectComplexType;
import ro.webdata.lido.parser.parser.model.element.leaf.subject.*;

import java.util.ArrayList;
import java.util.HashMap;

public class SubjectComplexTypeDAOImpl implements SubjectComplexTypeDAO {
    private static ExtentSubjectDAO extentSubject = new ExtentSubjectDAOImpl();
    private static SubjectConceptDAO subjectConcept = new SubjectConceptDAOImpl();
    private static SubjectActorDAO subjectActor = new SubjectActorDAOImpl();
    private static SubjectDateDAO subjectDate = new SubjectDateDAOImpl();
    private static SubjectEventDAO subjectEvent = new SubjectEventDAOImpl();
    private static SubjectPlaceDAO subjectPlace = new SubjectPlaceDAOImpl();
    private static SubjectObjectDAO subjectObject = new SubjectObjectDAOImpl();
    private static Utils utils = new Utils();

    public SubjectComplexType getSubjectComplexType(Node node) {
        ArrayList<ExtentSubject> extentSubjectList = new ArrayList<ExtentSubject>();
        ArrayList<SubjectConcept> subjectConceptList = new ArrayList<SubjectConcept>();
        ArrayList<SubjectActor> subjectActorList = new ArrayList<SubjectActor>();
        ArrayList<SubjectDate> subjectDateList = new ArrayList<SubjectDate>();
        ArrayList<SubjectEvent> subjectEventList = new ArrayList<SubjectEvent>();
        ArrayList<SubjectPlace> subjectPlaceList = new ArrayList<SubjectPlace>();
        ArrayList<SubjectObject> subjectObjectList = new ArrayList<SubjectObject>();
        HashMap<String, String> attributes = utils.getAttributes(node);

        NodeList childNodeList = node.getChildNodes();
        for (int i = 0; i < childNodeList.getLength(); i++) {
            Node child = childNodeList.item(i);
            String childName = child.getNodeName();

            switch (childName) {
                case "lido:extentSubject":
                    extentSubjectList.add(extentSubject.getExtentSubject(child));
                    break;
                case "lido:subjectConcept":
                    subjectConceptList.add(subjectConcept.getSubjectConcept(child));
                    break;
                case "lido:subjectActor":
                    subjectActorList.add(subjectActor.getSubjectActor(child));
                    break;
                case "lido:subjectDate":
                    subjectDateList.add(subjectDate.getSubjectDate(child));
                    break;
                case "lido:subjectEvent":
                    subjectEventList.add(subjectEvent.getSubjectEvent(child));
                    break;
                case "lido:subjectPlace":
                    subjectPlaceList.add(subjectPlace.getSubjectPlace(child));
                    break;
                case "lido:subjectObject":
                    subjectObjectList.add(subjectObject.getSubjectObject(child));
                    break;
                default: break;
            }
        }

        return new SubjectComplexType(
                extentSubjectList, subjectConceptList,
                subjectActorList, subjectDateList,
                subjectEventList, subjectPlaceList,
                subjectObjectList,
                new LidoType(attributes.get("lido:type"))
        );
    }
}
