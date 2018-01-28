package threads;

import java.awt.Color;

import org.jointheleague.graphical.robot.Robot;

public class OlympicRings_Threaded {
	// Make A Program that uses Threads and robots to draw the Olympic rings. One
	// robot should draw one ring simultaneously with the other 4 robots.
public static void main(String[] args) {
	Robot timmy = new Robot(425, 700);
	Robot tammy = new Robot(775, 700);
	Robot llama = new Robot(250, 500);
	Robot sammy = new Robot(600, 500);
	Robot robotic = new Robot(950, 500);
	
	timmy.setSpeed(20);
	tammy.setSpeed(20);
	llama.setSpeed(20);	
	sammy.setSpeed(20);
	robotic.setSpeed(20);
	
	new Thread(()->drawCircle(timmy, Color.yellow)).start();
	new Thread(()->drawCircle(tammy, Color.green)).start();
	new Thread(()->drawCircle(llama, Color.blue)).start();
	new Thread(()->drawCircle(sammy, Color.black)).start();
	new Thread(()->drawCircle(robotic, Color.red)).start();
}

	static void drawCircle(Robot x, Color y) {
		x.penDown();
		x.setPenWidth(20);
		x.setPenColor(y);
		for (int i = 0; i < 360; i++) {
			x.turn(1);
			x.move(3);
		}

	}

}
