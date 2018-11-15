package ro.webdata.lido.parser.core;

import ro.webdata.lido.parser.core.wrap.lidoWrap.LidoWrap;

public interface ParserDAO {
    LidoWrap parseLidoFile(String filePath);
}
