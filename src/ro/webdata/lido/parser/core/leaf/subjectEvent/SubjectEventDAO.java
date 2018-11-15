package ro.webdata.lido.parser.core.leaf.subjectEvent;

import org.w3c.dom.Node;

public interface SubjectEventDAO {
	/**
	 *
	 * @param node <b>lido:subjectEvent</b> node type.
	 * @return <b>SubjectEvent</b>
	 */
	SubjectEvent getSubjectEvent(Node node);
}
