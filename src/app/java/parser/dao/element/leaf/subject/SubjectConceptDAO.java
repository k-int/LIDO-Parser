package app.java.parser.dao.element.leaf.subject;

import app.java.parser.model.element.leaf.subject.SubjectConcept;
import org.w3c.dom.Node;

public interface SubjectConceptDAO {
	/**
	 *
	 * @param node <b>lido:subjectConcept</b> node type.
	 * @return <b>SubjectConcept</b>
	 */
	SubjectConcept getSubjectConcept(Node node);
}
