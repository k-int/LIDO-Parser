package ro.webdata.lido.parser.parser.dao.element.leaf.subject;

import ro.webdata.lido.parser.parser.model.element.leaf.subject.SubjectObject;
import org.w3c.dom.Node;

public interface SubjectObjectDAO {
	/**
	 *
	 * @param node <b>lido:subjectObject</b> node type.
	 * @return <b>SubjectObject</b>
	 */
	SubjectObject getSubjectObject(Node node);
}
