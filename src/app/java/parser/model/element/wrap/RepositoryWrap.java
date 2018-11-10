package app.java.parser.model.element.wrap;

import java.util.ArrayList;

import app.java.parser.model.element.set.RepositorySet;

/**<link rel="stylesheet" type="text/css" href="../../../../javadoc.css"/>
 * <div class="lido">
 * 	<div class="lido-title">Lido documentation:</div>
 * 	<div class="lido-doc">
 * 		<b>Definition:</b> Wrapper for Repository/ Location information.<br/>
 *
 * 		<b>Elements:</b>
 * 		<div class="lido-elem">
 * 			<b>repositorySet (lido:repositorySetComplexType 0-unbounded)</b>
 * 			<div class="lido-elem-doc">
 * 				<b>Definition:</b> Wrapper for designation and identification of the institution
 * 				of custody, and possibly an indication of the exact location of the object.
 * 			</div>
 * 		</div>
 * 	</div>
 * </div>
 * @author WebData
 *
 */
public class RepositoryWrap {
	private ArrayList<RepositorySet> repositorySet;

	public RepositoryWrap() {}

	public RepositoryWrap(ArrayList<RepositorySet> repositorySet) {
		setRepositorySet(repositorySet);
	}

	public ArrayList<RepositorySet> getRepositorySet() {
		return repositorySet;
	}

	public void setRepositorySet(ArrayList<RepositorySet> repositorySet) {
		this.repositorySet = repositorySet;
	}
}
