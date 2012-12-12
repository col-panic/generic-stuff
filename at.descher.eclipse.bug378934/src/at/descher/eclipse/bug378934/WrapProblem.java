package at.descher.eclipse.bug378934;

import org.eclipse.swt.SWT;
import org.eclipse.swt.custom.CTabFolder;
import org.eclipse.swt.custom.CTabItem;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.layout.RowLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.ToolBar;
import org.eclipse.swt.widgets.ToolItem;

public class WrapProblem {

	/**
	 * Launch the application.
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		Display display = Display.getDefault();
		Shell shell = new Shell();
		shell.setSize(300, 100);
		shell.setText("SWT Application");
		shell.setLayout(new FillLayout(SWT.HORIZONTAL));

		final CTabFolder ctfWithWrap = new CTabFolder(shell, SWT.BORDER);
		ctfWithWrap.setSelectionBackground(Display.getCurrent().getSystemColor(
				SWT.COLOR_TITLE_INACTIVE_BACKGROUND_GRADIENT));

		Composite comp = new Composite(ctfWithWrap, SWT.None);
		RowLayout rl = new RowLayout();
		rl.marginBottom = rl.marginTop = rl.marginRight = rl.marginLeft = 0;
		comp.setLayout(rl);

		ToolBar toolBar = new ToolBar(comp, SWT.FLAT | SWT.WRAP);
		ToolItem toolItem = new ToolItem(toolBar, SWT.PUSH);
		toolItem.setText("ctfWithWrap");

		ctfWithWrap.setTopRight(comp, SWT.RIGHT | SWT.WRAP);
		
		CTabItem tbtmNewItem = new CTabItem(ctfWithWrap, SWT.NONE);
		tbtmNewItem.setText("ctfWithWrap");

		// ----

		final CTabFolder ctfWithoutWrap = new CTabFolder(shell, SWT.BORDER);
		ctfWithoutWrap.setSelectionBackground(Display.getCurrent()
				.getSystemColor(SWT.COLOR_TITLE_INACTIVE_BACKGROUND_GRADIENT));

		Composite comp2 = new Composite(ctfWithoutWrap, SWT.None);
		RowLayout rl2 = new RowLayout();
		rl2.marginBottom = rl2.marginTop = rl2.marginRight = rl2.marginLeft = 0;
		comp2.setLayout(rl2);

		ToolBar toolBar2 = new ToolBar(comp2, SWT.FLAT | SWT.WRAP);
		ToolItem toolItem2 = new ToolItem(toolBar2, SWT.PUSH);
		toolItem2.setText("ctfWithoutWrap");

		ctfWithoutWrap.setTopRight(comp2, SWT.RIGHT);

		CTabItem tbtmNewItem2 = new CTabItem(ctfWithoutWrap, SWT.NONE);
		tbtmNewItem2.setText("ctfWithoutWrap");
		
		shell.open();
		// comp.pack();
		// shell.layout();
		while (!shell.isDisposed()) {
			if (!display.readAndDispatch()) {
				display.sleep();
			}
		}
	}
}
