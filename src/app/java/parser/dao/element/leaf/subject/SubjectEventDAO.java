package app.java.parser.dao.element.leaf.subject;

import app.java.parser.model.element.leaf.subject.SubjectEvent;
import org.w3c.dom.Node;

public interface SubjectEventDAO {
	/**
	 *
	 * @param node <b>lido:subjectEvent</b> node type.
	 * @return <b>SubjectEvent</b>
	 */
	SubjectEvent getSubjectEvent(Node node);
}
