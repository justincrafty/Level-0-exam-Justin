import java.awt.Color;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

/* Level 0 Exam: Coding  Exercise #1 */
public class CodingExercise1 {

	public static void main(String[] args) {
		Robot bob = new Robot();
		// 3. ask the user what color they would like the Robot to draw
		String john = JOptionPane.showInputDialog("What color would you like the robot to draw?");
		// 4. use an if/else statement to set the pen color that the user
		// requested (minimum of 2 colors)
		if (john.equalsIgnoreCase("blue")) {
			bob.setPenColor(Color.blue);
		}
		if (john.equalsIgnoreCase("green")) {
			bob.setPenColor(Color.green);
		}
		if (john.equalsIgnoreCase("red")) {
			bob.setPenColor(Color.red);
		}
		if (john.equalsIgnoreCase("orange")) {
			bob.setPenColor(Color.orange);
		}
		if (john.equalsIgnoreCase("black")) {
			bob.setPenColor(Color.black);
		}
		if (john.equalsIgnoreCase("pink")) {
			bob.setPenColor(Color.pink);
		}
		if (john.equalsIgnoreCase("gray")) {
			bob.setPenColor(Color.gray);
		}
		if (john.equalsIgnoreCase("yellow")) {
			bob.setPenColor(Color.yellow);
		}

		// 2. set the pen width to 10
		bob.setPenWidth(10);
		// 1. make the Robot draw a shape
		bob.penDown();
		bob.setSpeed(10);
		for (int i = 0; i < 3; i++) {
			bob.move(100);
			bob.turn(360 / 3);

		}

	}

}