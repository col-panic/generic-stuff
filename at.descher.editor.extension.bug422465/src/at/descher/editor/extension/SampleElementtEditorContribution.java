package at.descher.editor.extension;

import org.eclipse.core.databinding.UpdateValueStrategy;
import org.eclipse.core.databinding.observable.value.IObservableValue;
import org.eclipse.core.databinding.observable.value.WritableValue;
import org.eclipse.core.databinding.validation.IValidator;
import org.eclipse.core.databinding.validation.ValidationStatus;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.e4.tools.emf.ui.internal.editor.extension.ElementEditorContribution;
import org.eclipse.e4.ui.model.application.MApplicationElement;
import org.eclipse.e4.ui.model.application.impl.ApplicationPackageImpl;
import org.eclipse.e4.ui.model.application.ui.basic.MPart;
import org.eclipse.e4.ui.model.application.ui.impl.UiPackageImpl;
import org.eclipse.emf.databinding.EMFDataBindingContext;
import org.eclipse.emf.databinding.IEMFValueProperty;
import org.eclipse.emf.databinding.edit.EMFEditProperties;
import org.eclipse.emf.databinding.edit.IEMFEditValueProperty;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.impl.EcorePackageImpl;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.jface.databinding.swt.IWidgetValueProperty;
import org.eclipse.jface.databinding.swt.WidgetProperties;
import org.eclipse.jface.fieldassist.ControlDecoration;
import org.eclipse.jface.fieldassist.FieldDecoration;
import org.eclipse.jface.fieldassist.FieldDecorationRegistry;
import org.eclipse.swt.SWT;
import org.eclipse.swt.custom.CTabFolder;
import org.eclipse.swt.custom.CTabItem;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Text;

public class SampleElementtEditorContribution extends ElementEditorContribution {

	@Override
	public Class<? extends MApplicationElement> getContributedTo() {
		return MPart.class;
	}

	@Override
	public void createContributedForm(CTabFolder folder,
			EMFDataBindingContext context, WritableValue master, EditingDomain editingDomain) {

		CTabItem item = new CTabItem(folder, SWT.BORDER);
		item.setText("SampleAddition");

		Composite parent = createScrollableContainer(folder);
		item.setControl(parent.getParent());

		IWidgetValueProperty textProp = WidgetProperties.text(SWT.Modify);

		IEMFEditValueProperty modelProp = EMFEditProperties.value(
				editingDomain,
				ApplicationPackageImpl.Literals.APPLICATION_ELEMENT__ELEMENT_ID);
		
		createTextField(parent, "SampleLabel", "SampleTooltip", master,
				context, textProp, modelProp, "sampleWarning");
	}

	private void createTextField(Composite parent, String label,
			String tooltip, IObservableValue master,
			EMFDataBindingContext context, IWidgetValueProperty textProp,
			IEMFEditValueProperty modelProp, final String warningText) {
		Label l = new Label(parent, SWT.NONE);
		l.setText(label);
		if (tooltip != null) {
			l.setToolTipText(tooltip);
		}
		l.setLayoutData(new GridData(GridData.HORIZONTAL_ALIGN_END));

		final Text t = new Text(parent, SWT.BORDER);
		GridData gd = new GridData(GridData.FILL_HORIZONTAL);
		gd.horizontalSpan = 2;
		t.setLayoutData(gd);

		if (warningText != null) {
			final ControlDecoration controlDecoration = new ControlDecoration(
					t, SWT.LEFT | SWT.TOP);
			controlDecoration.setDescriptionText(warningText);
			FieldDecoration fieldDecoration = FieldDecorationRegistry
					.getDefault().getFieldDecoration(
							FieldDecorationRegistry.DEC_WARNING);
			controlDecoration.setImage(fieldDecoration.getImage());
			IValidator iv = new IValidator() {

				@Override
				public IStatus validate(Object value) {
					if (value == null) {
						controlDecoration.show();
						return ValidationStatus.warning(warningText);
					}
					if (value instanceof String) {
						String text = (String) value;
						if (text.trim().length() == 0) {
							controlDecoration.show();
							return ValidationStatus.warning(warningText);
						}
					}
					controlDecoration.hide();
					return Status.OK_STATUS;
				}
			};
			UpdateValueStrategy acv = new UpdateValueStrategy()
					.setAfterConvertValidator(iv);
			context.bindValue(textProp.observeDelayed(200, t),
					modelProp.observeDetail(master), acv, acv);
		} else
			context.bindValue(textProp.observeDelayed(200, t),
					modelProp.observeDetail(master));
	}

}
