package app.java.parser.dao.complex;

import app.java.parser.model.complex.RecordInfoSetComplexType;
import org.w3c.dom.Node;

public interface RecordInfoSetComplexTypeDAO {
	/**
	 *
	 * @param node <b>lido:recordInfoSetComplexType</b> node type.
	 * @return <b>RecordInfoSetComplexType</b>
	 */
	RecordInfoSetComplexType getRecordInfoSetComplexType(Node node);
}
