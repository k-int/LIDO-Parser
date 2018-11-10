package app.java.parser.model.element.wrap;

import java.util.ArrayList;

import app.java.parser.model.element.set.RightsWorkSet;

/**
 * <link rel="stylesheet" type="text/css" href="../../../../javadoc.css"/>
 * <div class="lido">
 * 	<div class="lido-title">Lido documentation:</div>
 * 	<div class="lido-doc">
 * 		<b>Definition:</b> Wrapper for rights information about the object / work described.<br/>
 * 		<b>Notes:</b> Rights information for the record and for resources is recorded in the
 * 		respective rights elements recordRights and rightsResource.<br/>
 *
 * 		<b>Elements:</b>
 * 		<div class="lido-elem">
 * 			<b>rightsWorkSet (0-unbounded)</b>
 * 			<div class="lido-elem-doc">
 * 				<b>Definition:</b> Information about rights management; may include copyright and
 * 				other intellectual property statements about the object / work.
 * 			</div>
 * 		</div>
 * 	</div>
 * </div>
 * @author WebData
 *
 */
public class RightsWorkWrap {
	private ArrayList<RightsWorkSet> rightsWorkSet;

	public RightsWorkWrap() {}

	public RightsWorkWrap(ArrayList<RightsWorkSet> rightsWorkSet) {
		setRightsWorkSet(rightsWorkSet);
	}

	public ArrayList<RightsWorkSet> getRightsWorkSet() {
		return rightsWorkSet;
	}

	public void setRightsWorkSet(ArrayList<RightsWorkSet> rightsWorkSet) {
		this.rightsWorkSet = rightsWorkSet;
	}
}
