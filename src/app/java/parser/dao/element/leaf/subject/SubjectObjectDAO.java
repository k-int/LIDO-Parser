package app.java.parser.dao.element.leaf.subject;

import app.java.parser.model.element.leaf.subject.SubjectObject;
import org.w3c.dom.Node;

public interface SubjectObjectDAO {
	/**
	 *
	 * @param node <b>lido:subjectObject</b> node type.
	 * @return <b>SubjectObject</b>
	 */
	SubjectObject getSubjectObject(Node node);
}
