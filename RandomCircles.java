package week2;

import java.awt.Color;

import acm.graphics.GOval;
import acm.program.GraphicsProgram;
import acm.util.RandomGenerator;


public class RandomCircles extends GraphicsProgram {
	
	public void run() {
		for (int i=0; i<10; i++) {
			makeCircle();
		}	
	}
	
	private void makeCircle() {
		int width = random.nextInt(10, 100);
		double nextX = (random.nextInt(0, (getWidth()-width)));
		double nextY = (random.nextInt(0, (getHeight()-width)));
		Color circleColor = random.nextColor();
		GOval circle = new GOval (nextX, nextY, width, width);
		circle.setColor(circleColor);
		circle.setFilled(true);
		add(circle);
	}
	
	public RandomGenerator random = RandomGenerator.getInstance();
	
	
}
