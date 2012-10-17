 
package at.descher.eclipse.bug389063.direct;

import org.eclipse.e4.core.di.annotations.Execute;

public class DirectMenuItem {
	@Execute
	public void execute() {
		System.err.println("Direct Menu Item selected");
	}
		
}