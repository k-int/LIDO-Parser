package ro.webdata.lido.parser;

import ro.webdata.lido.parser.common.Constants;
import ro.webdata.lido.parser.parser.dao.ParserDAO;
import ro.webdata.lido.parser.parser.dao.impl.ParserDAOImpl;
import ro.webdata.lido.parser.parser.model.element.LidoWrap;

public class Main {
//	http://www.lido-schema.org/schema/v1.0/lido-v1.0-schema-listing.html#conceptComplexType
//	Example: http://www.lido-schema.org/documents/examples/LIDO-Example_FMobj20344012-Fontana_del_Moro.xml
	//TODO: GENERAL: add getNodeName() and getNodeValue() methods
    //TODO: app.java.model.leaf.gml
    //TODO: PrintMessages for all required objects

	public static void main(String[] args) {
		String xmlFilePath = Constants.TEST_FILE_FULL_PATH;
		ParserDAO parserDAO = new ParserDAOImpl();
		LidoWrap lidoWrap = parserDAO.parseLidoFile(xmlFilePath);
	}
}
