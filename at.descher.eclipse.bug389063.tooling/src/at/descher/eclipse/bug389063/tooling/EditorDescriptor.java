package at.descher.eclipse.bug389063.tooling;

import org.eclipse.e4.tools.emf.ui.common.IEditorDescriptor;
import org.eclipse.e4.ui.model.application.ui.menu.impl.MenuPackageImpl;
import org.eclipse.emf.ecore.EClass;

import at.descher.eclipse.bug389603.tooling.editor.DynamicMenuContributionEditor;

public class EditorDescriptor implements IEditorDescriptor {

	public EditorDescriptor() {
	}

	@Override
	public Class<?> getEditorClass() {
		return DynamicMenuContributionEditor.class;
	}

	@Override
	public EClass getEClass() {
		return MenuPackageImpl.Literals.DYNAMIC_MENU_CONTRIBUTION;
	}

}
