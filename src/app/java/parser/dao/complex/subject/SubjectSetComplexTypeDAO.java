package app.java.parser.dao.complex.subject;

import app.java.parser.model.complex.subject.SubjectSetComplexType;
import org.w3c.dom.Node;

public interface SubjectSetComplexTypeDAO {
	/**
	 *
	 * @param node <b>lido:subjectSetComplexType</b> node type.
	 * @return <b>SubjectSetComplexType</b>
	 */
	SubjectSetComplexType getSubjectSetComplexType(Node node);
}
