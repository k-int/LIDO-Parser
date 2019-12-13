package ro.webdata.parser.xml.lido.common;

import java.util.HashMap;

import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.Node;

public class Utils {
	/**
	 * Get the attributes from a <b>Node</b> element and add them into a <b>HashMap</b>.
	 * @param item <b>Node</b> type element.
	 * @return <b>HashMap</b>
	 */
	public HashMap<String, String> getAttributes(Node item) {
		NamedNodeMap attributes = item.getAttributes();
		HashMap<String, String> hashMapAttr = new HashMap<String, String>();

		if (attributes != null) {
			for (int i = 0; i < attributes.getLength(); i++) {
				Node attr = attributes.item(i);
				hashMapAttr.put(attr.getNodeName(), attr.getNodeValue());
			}
		}

		return hashMapAttr;
	}
}
