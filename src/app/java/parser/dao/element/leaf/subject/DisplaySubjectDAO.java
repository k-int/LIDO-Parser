package app.java.parser.dao.element.leaf.subject;

import app.java.parser.model.element.leaf.subject.DisplaySubject;
import org.w3c.dom.Node;

public interface DisplaySubjectDAO {
	/**
	 *
	 * @param node <b>lido:displaySubject</b> node type.
	 * @return <b>DisplaySubject</b>
	 */
	DisplaySubject getDisplaySubject(Node node);
}
