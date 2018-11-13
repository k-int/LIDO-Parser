package ro.webdata.lido.parser.parser.dao.element.leaf.subject;

import ro.webdata.lido.parser.parser.model.element.leaf.subject.ExtentSubject;
import org.w3c.dom.Node;

public interface ExtentSubjectDAO {
	/**
	 *
	 * @param node <b>lido:extentSubject</b> node type.
	 * @return <b>ExtentSubject</b>
	 */
	ExtentSubject getExtentSubject(Node node);
}
