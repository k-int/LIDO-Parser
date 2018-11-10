package app.java.parser.dao.element.leaf.subject;

import app.java.parser.model.element.leaf.subject.ExtentSubject;
import org.w3c.dom.Node;

public interface ExtentSubjectDAO {
	/**
	 *
	 * @param node <b>lido:extentSubject</b> node type.
	 * @return <b>ExtentSubject</b>
	 */
	ExtentSubject getExtentSubject(Node node);
}
