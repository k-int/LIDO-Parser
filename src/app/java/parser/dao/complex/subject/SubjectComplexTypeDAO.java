package app.java.parser.dao.complex.subject;

import app.java.parser.model.complex.subject.SubjectComplexType;
import org.w3c.dom.Node;

public interface SubjectComplexTypeDAO {
	/**
	 *
	 * @param node <b>lido:subjectComplexType</b> node type.
	 * @return <b>SubjectComplexType</b>
	 */
	SubjectComplexType getSubjectComplexType(Node node);
}
