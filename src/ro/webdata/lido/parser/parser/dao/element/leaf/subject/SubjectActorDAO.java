package ro.webdata.lido.parser.parser.dao.element.leaf.subject;

import ro.webdata.lido.parser.parser.model.element.leaf.subject.SubjectActor;
import org.w3c.dom.Node;

public interface SubjectActorDAO {
	/**
	 *
	 * @param node <b>lido:subjectActor</b> node type.
	 * @return <b>SubjectActor</b>
	 */
	SubjectActor getSubjectActor(Node node);
}
