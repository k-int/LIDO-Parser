package ro.webdata.lido.parser.common;

public class Constants {
//	public static final String FILE_NAME = "LIDO-Extended-Example.xml";
	public static final String FILE_NAME = "LIDO-Test.xml";
	public static final String FILE_SEPARATOR = System.getProperty("file.separator");
	public static final String WORKSPACE_PATH = System.getProperty("user.dir");
	public static final String FILE_FULL_PATH = WORKSPACE_PATH
			+ FILE_SEPARATOR + "files";
	public static final String TEST_FILE_FULL_PATH = FILE_FULL_PATH + FILE_SEPARATOR + FILE_NAME;
}
