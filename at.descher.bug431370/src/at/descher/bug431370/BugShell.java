package at.descher.bug431370;

import org.eclipse.jface.viewers.ArrayContentProvider;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.jface.viewers.TableViewer;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Table;

public class BugShell extends Shell {
	
	/**
	 * Launch the application.
	 * 
	 * @param args
	 */
	public static void main(String args[]){
		try {
			Display display = Display.getDefault();
			BugShell shell = new BugShell(display);
			shell.open();
			shell.layout();
			while (!shell.isDisposed()) {
				if (!display.readAndDispatch()) {
					display.sleep();
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	/**
	 * Create the shell.
	 * 
	 * @param display
	 */
	public BugShell(Display display){
		super(display, SWT.SHELL_TRIM);
		createContents();
	}
	
	private String[] input = new String[] {
		"1", "2"
	};
	
	/**
	 * Create contents of the shell.
	 */
	protected void createContents(){
		setText("SWT Application");
		setSize(450, 300);
		setLayout(new GridLayout(1, false));
		Composite composite = new Composite(this, SWT.NONE);
		composite.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true, 1, 1));
		composite.setLayout(new GridLayout(1, false));
		TableViewer tv = new TableViewer(composite, SWT.BORDER | SWT.FULL_SELECTION | SWT.MULTI);
		Table table = tv.getTable();
		table.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true, 1, 1));
		tv.setLabelProvider(new LabelProvider());
		tv.setContentProvider(ArrayContentProvider.getInstance());
		tv.setInput(input);
		
		tv.getTable().addSelectionListener(new SelectionAdapter() {
			public void widgetSelected(org.eclipse.swt.events.SelectionEvent e) {
				IStructuredSelection is = (IStructuredSelection) tv.getSelection();
				Object ob = is.getFirstElement();
				System.out.println("SelectionAdapter: "+ob);
				
//				 ob.toString(); // UNCOMMENT TO CRASH BY FOLLOWING PROCEDURE			
				// 1. Select element 1 or 2
				// 2. Select the table element in the "open are", that is where
				// there are no elements which will reselt to ob being null here
			};
		});

		tv.addSelectionChangedListener(new ISelectionChangedListener() {
			
			@Override
			public void selectionChanged(SelectionChangedEvent event){
				IStructuredSelection is = (IStructuredSelection) tv.getSelection();
				Object ob = is.getFirstElement();
				System.out.println("SelectionChangedListener: "+ob);
				
//				 ob.toString(); // UNCOMMENT DOES NOT CRASH BUT SHOW REAL NPE			
				// 1. Select element 1 or 2
				// 2. Select the table element in the "open are", that is where
				// there are no elements which will reselt to ob being null here
			}
		});
	}
	
	@Override
	protected void checkSubclass(){
		// Disable the check that prevents subclassing of SWT components
	}
	
}
