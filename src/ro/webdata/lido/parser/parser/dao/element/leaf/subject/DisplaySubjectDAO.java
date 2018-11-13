package ro.webdata.lido.parser.parser.dao.element.leaf.subject;

import ro.webdata.lido.parser.parser.model.element.leaf.subject.DisplaySubject;
import org.w3c.dom.Node;

public interface DisplaySubjectDAO {
	/**
	 *
	 * @param node <b>lido:displaySubject</b> node type.
	 * @return <b>DisplaySubject</b>
	 */
	DisplaySubject getDisplaySubject(Node node);
}
