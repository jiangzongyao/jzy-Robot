package com.jzy.windown;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Date;

import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Text;

public class Run {

	protected Shell shell;
	private Text x1;
	private Text y1;
	private Text x2;
	private Text y2;
	private Text x3;
	private Text y3;
	private Text text_6;
	private Text text_7;
	private Text text_8;
	private Text text_9;
	private Text x4;
	private Text y4;
	private Text x5;
	private Text y5;
	private Text x6;
	private Text y6;
	private Text x7;
	private Text y7;
	private Text x8;
	private Text y8;
	private Text x9;
	private Text y9;
	private Text x10;
	private Text y10;
	private Text x11;
	private Text y11;
	private Text x12;
	private Text y12;
	private Text y15;
	private Text x15;
	private Text content;

	/**
	 * Launch the application.
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			Run window = new Run();
			window.open();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Open the window.
	 */
	public void open() {
		Display display = Display.getDefault();
		createContents();
		shell.open();
		shell.layout();
		while (!shell.isDisposed()) {
			if (!display.readAndDispatch()) {
				display.sleep();
			}
		}
	}

	/**
	 * Create contents of the window.
	 */
	protected void createContents() {
		shell = new Shell();
		shell.setSize(200, 100);
		shell.setText("菊花自动留言器");
		content = new Text(shell, SWT.BORDER);
		content.setBounds(23, 20, 80, 20);
		
		Button start = new Button(shell, SWT.NONE);
		start.setBounds(10, 50, 80, 27);
		start.setText("\u5F00\u59CB");
		
		start.addSelectionListener(new SelectionAdapter(){  
		    @Override  
		    public void widgetSelected(SelectionEvent e){
		    	
		    	String steps = "[{'message':'aaa','type':'1','x':100,'y':800,'y2':1000}]";
	    		Robot robot = null;

	    		try {
	    			robot = new Robot();
	    		} catch (AWTException e1) {
	    			e1.printStackTrace();
	    		}
		    }
		});  
	}
}
