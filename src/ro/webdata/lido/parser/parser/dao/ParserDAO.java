package ro.webdata.lido.parser.parser.dao;

import ro.webdata.lido.parser.parser.model.element.LidoWrap;

public interface ParserDAO {
    LidoWrap parseLidoFile(String filePath);
}
