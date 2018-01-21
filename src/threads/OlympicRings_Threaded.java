package threads;

import java.awt.Color;

import org.jointheleague.graphical.robot.Robot;

public class OlympicRings_Threaded {
	// Make A Program that uses Threads and robots to draw the Olympic rings. One
	// robot should draw one ring simultaneously with the other 4 robots.
public static void main(String[] args) {
	Robot timmy = new Robot(400, 700);
	Robot tammy = new Robot(800, 700);
	Robot llama = new Robot(1200, 700);
	
	OlympicRings_Threaded us = new OlympicRings_Threaded();
	
	
	timmy.setSpeed(10);
	tammy.setSpeed(10);
	llama.setSpeed(10);	
	us.drawCircle(timmy, Color.yellow);
	us.drawCircle(tammy, Color.green);
//	us.drawCircle(llama, Color.blue);
	
}

	void drawCircle(Robot x, Color y) {
		x.penDown();
		x.setPenWidth(20);
		x.setPenColor(y);
		for (int i = 0; i < 360; i++) {
			x.turn(1);
			x.move(3);
		}

	}

}
