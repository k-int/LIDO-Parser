package ro.webdata.lido.parser.parser.dao.impl.element.leaf.descriptiveNote;

import ro.webdata.lido.parser.parser.dao.complex.TextComplexTypeDAO;
import ro.webdata.lido.parser.parser.dao.element.leaf.descriptiveNote.DescriptiveNoteValueDAO;
import ro.webdata.lido.parser.parser.dao.impl.complex.TextComplexTypeDAOImpl;
import ro.webdata.lido.parser.parser.model.element.leaf.descriptiveNote.DescriptiveNoteValue;
import org.w3c.dom.Node;

public class DescriptiveNoteValueDAOImpl implements DescriptiveNoteValueDAO {
    private static TextComplexTypeDAO textComplexTypeDAO = new TextComplexTypeDAOImpl();

    public DescriptiveNoteValue getDescriptiveNoteValue(Node node) {
        return new DescriptiveNoteValue(textComplexTypeDAO.getTextComplexType(node));
    }
}
