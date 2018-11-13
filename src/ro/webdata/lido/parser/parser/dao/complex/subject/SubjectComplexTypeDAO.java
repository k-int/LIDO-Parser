package ro.webdata.lido.parser.parser.dao.complex.subject;

import ro.webdata.lido.parser.parser.model.complex.subject.SubjectComplexType;
import org.w3c.dom.Node;

public interface SubjectComplexTypeDAO {
	/**
	 *
	 * @param node <b>lido:subjectComplexType</b> node type.
	 * @return <b>SubjectComplexType</b>
	 */
	SubjectComplexType getSubjectComplexType(Node node);
}
