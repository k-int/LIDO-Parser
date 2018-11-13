package ro.webdata.lido.parser.parser.dao.element.leaf.subject;

import ro.webdata.lido.parser.parser.model.element.leaf.subject.SubjectDate;
import org.w3c.dom.Node;

public interface SubjectDateDAO {
	/**
	 *
	 * @param node <b>lido:subjectDate</b> node type.
	 * @return <b>SubjectDate</b>
	 */
	SubjectDate getSubjectDate(Node node);
}
