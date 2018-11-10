package app.java.parser.dao;

import app.java.parser.model.element.LidoWrap;

public interface ParserDAO {
    LidoWrap parseLidoFile(String filePath);
}
