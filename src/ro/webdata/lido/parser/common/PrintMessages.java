package ro.webdata.lido.parser.common;

import ro.webdata.lido.parser.core.leaf.lido.Lido;
import ro.webdata.lido.parser.core.wrap.lidoWrap.LidoWrap;

public class PrintMessages {
    /**
     * Print a warning message for the case when the LIDO documentation
     * require a non empty array.
     * @param objectClass The class where the warning message has been triggered
     * @param nodeName The name of the required LIDO node
     */
	public void printEmptyArray(Class objectClass, String nodeName) {
		System.err.println(objectClass.getName() + " error:"
				+ "\t* " + nodeName + " must have at least one record."
		);
	}

    /**
     * Print a warning message for the case when the LIDO documentation
     * require a non empty attribute.
     * @param objectClass The class where the warning message has been triggered
     * @param attributeName The name of the required LIDO attribute
     */
	public void printUndefinedAttribute(Class objectClass, String attributeName) {
		System.err.println(objectClass.getName() + " error:"
				+ "\t* the " + attributeName + " attribute must be defined."
		);
	}

    /**
     * Print a warning message for the case when the LIDO documentation
     * require a non empty node.
     * @param objectClass The class where the warning message has been triggered
     * @param nodeName The name of the required LIDO node
     */
	public void printUndefinedNode(Class objectClass, String nodeName) {
		System.err.println(objectClass.getName() + " error:"
				+ "\t* the " + nodeName + " node must be defined."
		);
	}

    /**
     * Print a summary log for the "lido:lido" nodes.
     * @param lidoWrap The "lido:lidoWrap" root element
     */
	public void printLidoSummary(LidoWrap lidoWrap) {
        System.out.println("START lido summary");
        for (int i = 0; i < lidoWrap.getLido().size(); i++) {
            Lido lido = lidoWrap.getLido().get(i);
            String categoryExistence = lido.getCategory() != null ? "1" : "0";
            System.out.println("\nlidoRecIDList size: " + lido.getLidoRecID().size()
                    + "\nobjectPublishedIDList size: " + lido.getObjectPublishedID().size()
                    + "\ncategory size: " + categoryExistence
                    + "\ndescriptiveMetadata size: " + lido.getDescriptiveMetadata().size()
                    + "\nadministrativeMetadata size: " + lido.getAdministrativeMetadata().size());
        }
        System.out.println("\nEND lido summary");
	}
}
