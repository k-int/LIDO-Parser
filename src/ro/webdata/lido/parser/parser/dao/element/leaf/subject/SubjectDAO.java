package ro.webdata.lido.parser.parser.dao.element.leaf.subject;

import ro.webdata.lido.parser.parser.model.element.leaf.subject.Subject;
import org.w3c.dom.Node;

public interface SubjectDAO {
	/**
	 *
	 * @param node <b>lido:subject</b> node type.
	 * @return <b>SubjectDAO</b>
	 */
	Subject getSubject(Node node);
}
