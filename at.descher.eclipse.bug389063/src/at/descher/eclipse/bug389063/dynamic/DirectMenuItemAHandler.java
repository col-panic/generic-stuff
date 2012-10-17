 
package at.descher.eclipse.bug389063.dynamic;

import org.eclipse.e4.core.di.annotations.Execute;
import org.eclipse.e4.ui.model.application.ui.menu.MMenuElement;

public class DirectMenuItemAHandler {
	@Execute
	public void execute(MMenuElement me) {
		System.err.println("Dynamic element selected "+me);
	}
		
}