package com.jzy.core;

import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.util.Date;

public final class Functions {
	public void moveMouse(Robot robot,StepInfo stepInfo){
		robot.mouseMove(stepInfo.getX(), stepInfo.getY());
		robot.delay(1000);
		robot.mousePress(KeyEvent.BUTTON1_MASK);
		robot.mouseRelease(KeyEvent.BUTTON1_MASK);
	}
	public void dragMouse(Robot robot,StepInfo stepInfo){
		robot.mouseMove(stepInfo.getX(),stepInfo.getY());
		robot.mousePress(KeyEvent.BUTTON1_MASK);
	    for(int i=stepInfo.getY2();i<=stepInfo.getY();i++){
	    	robot.delay(1);
	    	robot.mouseMove(stepInfo.getX(), stepInfo.getY());
	    }
	}
	public void moveMouseAndWriteMessage(Robot robot,StepInfo stepInfo){
		robot.mouseMove(stepInfo.getX(), stepInfo.getY());
		robot.delay(1000);
		robot.mousePress(KeyEvent.BUTTON1_MASK);
		robot.mouseRelease(KeyEvent.BUTTON1_MASK);
		StringSelection stringSelection = new StringSelection(stepInfo.getMessage()+"*****"+new Date());
	    Toolkit.getDefaultToolkit().getSystemClipboard().setContents(stringSelection, null);
	    robot.keyPress(KeyEvent.VK_COMMA);
	    robot.delay(500);
	    robot.keyPress(KeyEvent.VK_V);
	    robot.delay(1000);
	}
}
