package week2;

import java.awt.event.MouseEvent;

import acm.graphics.GLine;
import acm.program.GraphicsProgram;

public class DrawingLines extends GraphicsProgram {
	
	public void run() {
		addMouseListeners();
		waitForClick();
	}
	
	public void mousePressed(MouseEvent e) {
		startX = e.getX();
		startY = e.getY();
		line = new GLine(startX, startY, startX, startY);
		add(line);
	}
	
	public void mouseDragged(MouseEvent e) {
		endX = e.getX();
		endY = e.getY();
		line.setEndPoint(endX, endY);
	}
	
	public void mouseReleased(MouseEvent e) {
		line.setEndPoint(endX, endY);
	}
	
	GLine line;
	double startX;
	double startY;
	double endX;
	double endY;
	
}
