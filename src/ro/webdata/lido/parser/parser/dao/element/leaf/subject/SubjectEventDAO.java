package ro.webdata.lido.parser.parser.dao.element.leaf.subject;

import ro.webdata.lido.parser.parser.model.element.leaf.subject.SubjectEvent;
import org.w3c.dom.Node;

public interface SubjectEventDAO {
	/**
	 *
	 * @param node <b>lido:subjectEvent</b> node type.
	 * @return <b>SubjectEvent</b>
	 */
	SubjectEvent getSubjectEvent(Node node);
}
