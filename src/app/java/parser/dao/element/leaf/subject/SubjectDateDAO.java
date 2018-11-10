package app.java.parser.dao.element.leaf.subject;

import app.java.parser.model.element.leaf.subject.SubjectDate;
import org.w3c.dom.Node;

public interface SubjectDateDAO {
	/**
	 *
	 * @param node <b>lido:subjectDate</b> node type.
	 * @return <b>SubjectDate</b>
	 */
	SubjectDate getSubjectDate(Node node);
}
