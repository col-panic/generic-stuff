package at.descher.editor.extension;

import java.util.HashMap;

import org.eclipse.core.databinding.UpdateValueStrategy;
import org.eclipse.core.databinding.observable.value.IValueChangeListener;
import org.eclipse.core.databinding.observable.value.ValueChangeEvent;
import org.eclipse.core.databinding.observable.value.WritableValue;
import org.eclipse.e4.tools.emf.ui.common.AbstractElementEditorContribution;
import org.eclipse.e4.ui.model.application.MApplicationElement;
import org.eclipse.emf.databinding.EMFDataBindingContext;
import org.eclipse.emf.databinding.edit.EMFEditProperties;
import org.eclipse.emf.databinding.edit.IEMFEditValueProperty;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.jface.databinding.swt.IWidgetValueProperty;
import org.eclipse.jface.databinding.swt.WidgetProperties;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Text;

import documentation.ApplicationElementDocumentation;
import documentation.DocumentationFactory;
import documentation.DocumentationPackage;

public class ApplicationElementDocumentationContribution extends
		AbstractElementEditorContribution {

	private static HashMap<String, ApplicationElementDocumentation> docHash = new HashMap<>();
	
	public ApplicationElementDocumentationContribution() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public Class<?> getContributableTo() {
		return MApplicationElement.class;
	}

	@Override
	public String getTabLabel() {
		return "Documentation";
	}

	@Override
	public void createContributedEditorTab(Composite parent,
			EMFDataBindingContext context, WritableValue master,
			EditingDomain editingDomain) {
		System.out.println("createContributedEditorTab()");

		final WritableValue wvDocu = new WritableValue(null,
				ApplicationElementDocumentation.class);
		
		Label l = new Label(parent, SWT.NONE);
		l.setText(getTabLabel());
		l.setLayoutData(new GridData(GridData.HORIZONTAL_ALIGN_END));

		final Text text = new Text(parent, SWT.BORDER | SWT.MULTI);
		GridData gd = new GridData(GridData.FILL_BOTH);
		gd.horizontalSpan = 2;
		text.setLayoutData(gd);
		
		UpdateValueStrategy acv = new UpdateValueStrategy();
		
		IWidgetValueProperty textProp = WidgetProperties.text(SWT.Modify);

		IEMFEditValueProperty modelProp = EMFEditProperties.value(
				editingDomain,
				DocumentationPackage.Literals.APPLICATION_ELEMENT_DOCUMENTATION__DOCUMENTATION);
		
		context.bindValue(textProp.observeDelayed(200, text),
				modelProp.observeDetail(wvDocu), acv, acv);

		master.addValueChangeListener(new IValueChangeListener() {

			@Override
			public void handleValueChange(ValueChangeEvent event) {
				WritableValue wv = (WritableValue) event.getSource();
				MApplicationElement mae = (MApplicationElement) wv.getValue();

				String elementId = mae.getElementId();
				if (elementId == null) {
					wvDocu.setValue(null);
					System.out.println("[ERR] null elementId");
					return;
				}

				if (!docHash.containsKey(elementId))
					docHash.put(elementId, DocumentationFactory.eINSTANCE
							.createApplicationElementDocumentation());

				wvDocu.setValue(docHash.get(elementId));
				System.out.println("setting "+docHash.get(elementId));
			}
		});

	}

}
