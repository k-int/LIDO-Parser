package app.java.parser.dao.element.leaf.subject;

import app.java.parser.model.element.leaf.subject.SubjectActor;
import org.w3c.dom.Node;

public interface SubjectActorDAO {
	/**
	 *
	 * @param node <b>lido:subjectActor</b> node type.
	 * @return <b>SubjectActor</b>
	 */
	SubjectActor getSubjectActor(Node node);
}
