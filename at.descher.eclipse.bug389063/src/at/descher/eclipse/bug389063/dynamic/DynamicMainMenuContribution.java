package at.descher.eclipse.bug389063.dynamic;

import java.util.Date;
import java.util.List;

import org.eclipse.e4.ui.di.AboutToHide;
import org.eclipse.e4.ui.di.AboutToShow;
import org.eclipse.e4.ui.model.application.ui.menu.ItemType;
import org.eclipse.e4.ui.model.application.ui.menu.MDirectMenuItem;
import org.eclipse.e4.ui.model.application.ui.menu.MMenuElement;
import org.eclipse.e4.ui.model.application.ui.menu.MMenuFactory;
import org.eclipse.e4.ui.model.application.ui.menu.MMenuSeparator;

public class DynamicMainMenuContribution {

	private static boolean addSecond = true;

	@AboutToShow
	public void aboutToShow(List<MMenuElement> items) {
		System.out.println("aboutToShow() items-size: "+items.size());
		MDirectMenuItem dynamicItem = MMenuFactory.INSTANCE
				.createDirectMenuItem();
		dynamicItem.setLabel("Dynamic Menu Item (" + new Date() + ")");
		dynamicItem
				.setContributorURI("platform:/plugin/at.descher.eclipse.bug389063");
		dynamicItem
				.setContributionURI("bundleclass://at.descher.eclipse.bug389063/at.descher.eclipse.bug389063.dynamic.DirectMenuItemAHandler");
		items.add(dynamicItem);

		if (addSecond) {
			MDirectMenuItem dynamicItem2 = MMenuFactory.INSTANCE
					.createDirectMenuItem();
			dynamicItem2.setLabel("Dynamic Menu Item 2 (" + new Date() + ")");
			dynamicItem2
					.setContributionURI("bundleclass://at.descher.eclipse.bug389063/at.descher.eclipse.bug389063.dynamic.DirectMenuItemAHandler");
			items.add(dynamicItem2);
		}

		MMenuSeparator separatorItem = MMenuFactory.INSTANCE
				.createMenuSeparator();
		items.add(separatorItem);

		MDirectMenuItem dynamicCheckMenuItem = MMenuFactory.INSTANCE
				.createDirectMenuItem();
		dynamicCheckMenuItem.setLabel("Check: section above separator shows 2 DirectMenuItems");
		dynamicCheckMenuItem.setType(ItemType.CHECK);
		dynamicCheckMenuItem.setSelected(addSecond);
		dynamicCheckMenuItem
				.setContributionURI("bundleclass://at.descher.eclipse.bug389063/at.descher.eclipse.bug389063.dynamic.DirectMenuItemAHandler");
		items.add(dynamicCheckMenuItem);
	}

	@AboutToHide
	public void aboutToHide(List<MMenuElement> items) {
		System.out.println("aboutToHide() items-size: "+items.size());
		addSecond = !addSecond;
	}

}
