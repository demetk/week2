package week2;

import java.awt.Color;

import acm.graphics.GOval;
import acm.graphics.GRect;
import acm.program.GraphicsProgram;


public class RobotFace extends GraphicsProgram {
	
	private int HEAD_HEIGHT = 400;
	private int HEAD_WIDTH = 300;
	private double EYE_RADIUS = (HEAD_WIDTH*0.10);
	private double MOUTH_WIDTH = (HEAD_WIDTH*0.50);
	private double MOUTH_HEIGHT = (HEAD_HEIGHT*0.10);
	
	public void run() {
		makeHead();
		makeRightEye();
		makeLeftEye();
		makeMouth();
	}
	
	private void makeHead() {
		head = new GRect(HEAD_WIDTH, HEAD_HEIGHT);
		head.setFillColor(Color.GRAY);
		head.setFilled(true);
		add(head, ((getWidth()-HEAD_WIDTH)/2), ((getHeight()-HEAD_HEIGHT)/2));
	}
	
	private void makeRightEye() {
		rightEye = new GOval(EYE_RADIUS*2, EYE_RADIUS*2);
		rightEye.setColor(Color.YELLOW);
		rightEye.setFillColor(Color.YELLOW);
		rightEye.setFilled(true);
		double rightEyeX = ((head.getX())+((HEAD_WIDTH-(EYE_RADIUS*2))*0.75));
		double rightEyeY = ((head.getY())+((HEAD_HEIGHT-(EYE_RADIUS*2))*0.25));
		add(rightEye, rightEyeX, rightEyeY);
	}
	
	private void makeLeftEye() {
		leftEye = new GOval(EYE_RADIUS*2, EYE_RADIUS*2);
		leftEye.setColor(Color.YELLOW);
		leftEye.setFillColor(Color.YELLOW);
		leftEye.setFilled(true);
		double leftEyeX = ((head.getX())+((HEAD_WIDTH-(EYE_RADIUS*2))*0.25));
		double leftEyeY = ((head.getY())+((HEAD_HEIGHT-(EYE_RADIUS*2))*0.25));
		add(leftEye, leftEyeX, leftEyeY);
	}
	
	private void makeMouth() {
		mouth = new GRect(MOUTH_WIDTH, MOUTH_HEIGHT);
		mouth.setColor(Color.WHITE);
		mouth.setFillColor(Color.WHITE);
		mouth.setFilled(true);
		double mouthX = ((getWidth()-MOUTH_WIDTH)/2);
		double mouthY = ((head.getY())+((HEAD_HEIGHT-MOUTH_HEIGHT)*0.75));
		add(mouth, mouthX, mouthY);
	}
	
	GRect head;
	GOval rightEye;
	GOval leftEye;
	GRect mouth;
}
	
