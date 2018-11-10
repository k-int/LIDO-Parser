package app.java.parser.dao.impl;

import app.java.common.PrintMessages;
import app.java.parser.dao.ParserDAO;
import app.java.parser.dao.LidoWrapDAO;
import app.java.parser.model.element.LidoWrap;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.File;
import java.io.IOException;

public class ParserDAOImpl implements ParserDAO {
    private static LidoWrapDAO lidoWrapParser = new LidoWrapDAOImpl();
    private static PrintMessages printMessages = new PrintMessages();

    public LidoWrap parseLidoFile(String filePath) {
        LidoWrap lidoWrap = null;
        File xmlFile = new File(filePath);
        DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();

        try {
            DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
            Document doc = dBuilder.parse(xmlFile);
            doc.getDocumentElement().normalize();
            Element lidoWrapNode = doc.getDocumentElement();
            lidoWrap = lidoWrapParser.getLidoWrap(lidoWrapNode);

            printMessages.printLidoSummary(lidoWrap);
        } catch (ParserConfigurationException e) {
            e.printStackTrace();
        } catch (SAXException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        return lidoWrap;
    }
}
