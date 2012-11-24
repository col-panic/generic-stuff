

import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Menu;
import org.eclipse.swt.widgets.MenuItem;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.widgets.List;


public class Bug388402TestShell extends Shell {

	// items.length in list is allocated in steps of 4
	public static final String[] ELEMENTS = {"ELEMENT_A", "ELEMENT_B", "ELEMENT_C", "ELEMENT_D"};
	private List list;
	private static Bug388402TestShell shell;
	private static int addCounter = 0;
	
	/**
	 * Launch the application.
	 * @param args
	 */
	public static void main(String args[]) {
		try {
			Display display = Display.getDefault();
			shell = new Bug388402TestShell(display);
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
	 * @param display
	 */
	public Bug388402TestShell(Display display) {
		super(display, SWT.SHELL_TRIM);
		setLayout(new FillLayout(SWT.HORIZONTAL));
		
		list = new List(this, SWT.BORDER);
		for (int i = 0; i < ELEMENTS.length; i++) {
			list.add(ELEMENTS[i]);
		}
		
	
		Menu menu = new Menu(list);
		MenuItem deleteElement = new MenuItem(menu, SWT.PUSH);
		deleteElement.setText("delete element (NPE after removal of last element or possibly sooner)");
		deleteElement.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				try {
					System.out.println("removing "+list.getSelectionIndex()+" "+list.getSelection()[0]);
					list.remove(list.getSelectionIndex());
					super.widgetSelected(e);
				} catch (Exception ex) {
					ex.printStackTrace();
				}

			}
		});
		
		MenuItem deleteElement2 = new MenuItem(menu, SWT.PUSH);
		deleteElement2.setText("delete element (instant NPE)");
		deleteElement2.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				try {
					System.out.println("removing "+list.getSelectionIndex()+" "+list.getSelection()[0]);
					list.remove(list.getSelectionIndex());
					list.redraw();
					super.widgetSelected(e);
				} catch (Exception ex) {
					ex.printStackTrace();
				}

			}
		});
		
		MenuItem addElement = new MenuItem(menu, SWT.PUSH);
		addElement.setText("add element");
		addElement.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				System.out.println("adding element");
				list.add("ELEMENT_"+addCounter++);
			}
		});
		
		list.setMenu(menu);
		
		createContents();
	}

	/**
	 * Create contents of the shell.
	 */
	protected void createContents() {
		setText("SWT Application");
		setSize(450, 300);

	}

	@Override
	protected void checkSubclass() {
		// Disable the check that prevents subclassing of SWT components
	}
}
