package ro.webdata.lido.parser.parser.dao.element.leaf.subject;

import ro.webdata.lido.parser.parser.model.element.leaf.subject.SubjectConcept;
import org.w3c.dom.Node;

public interface SubjectConceptDAO {
	/**
	 *
	 * @param node <b>lido:subjectConcept</b> node type.
	 * @return <b>SubjectConcept</b>
	 */
	SubjectConcept getSubjectConcept(Node node);
}
