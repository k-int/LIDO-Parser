package ro.webdata.lido.parser.parser.dao.element.leaf.subject;

import ro.webdata.lido.parser.parser.model.element.leaf.subject.SubjectPlace;
import org.w3c.dom.Node;

public interface SubjectPlaceDAO {
	/**
	 *
	 * @param node <b>lido:subjectPlace</b> node type.
	 * @return <b>SubjectPlace</b>
	 */
	SubjectPlace getSubjectPlace(Node node);
}
