# LIDO-Parser
Java parser for metadata presented according to LIDO XML Schema

## Local setup
### Requirements
- JDK 8 or OpenJDK 1.8.

## Example
### Parsing:
```java
public class LidoWrapProcessing {
    private static final ParserDAO parserDAO = new ParserDAOImpl();

    public static void parse(String fullPath) {
        LidoWrap lidoWrap = parserDAO.parseLidoFile(fullPath);
        // Get the list of "lido" elements
        ArrayList<Lido> lidoList = lidoWrap.getLidoList();
        
        for (Lido lido : lidoList) {
            ArrayList<LidoRecID> lidoRecIDList = lido.getLidoRecID();
            Category category = lido.getCategory();
            ArrayList<AdministrativeMetadata> administrativeMetadataList = lido.getAdministrativeMetadata();
            ArrayList<DescriptiveMetadata> descriptiveMetadataList = lido.getDescriptiveMetadata();

            // then, you can go deeper to extract administrative/descriptive data, categories and lido ids
        }
    }
}
```

### Serialization using "jackson" library:
```java
public class LidoWrapProcessing {
    private static final ParserDAO parserDAO = new ParserDAOImpl();

    public static void serialize(String inputFullPath, outputPath) {
        LidoWrap lidoWrap = parserDAO.parseLidoFile(inputFullPath);
        ObjectMapper mapper = new ObjectMapper();

        try {
            mapper.writeValue(new File(outputPath), lidoWrap);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
```
