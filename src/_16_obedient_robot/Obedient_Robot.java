package _16_obedient_robot;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class Obedient_Robot {
	public static void main(String[] args) {
		Robot bob = new Robot();
		bob.setSpeed(100);
		bob.penDown();
		String color = JOptionPane.showInputDialog("What color would you like the shape to be (e.g. red, yellow, blue)?");
		if (color.equalsIgnoreCase("RED")) {
			bob.setPenColor(255,0,99);
		}
		if (color.equalsIgnoreCase("YELLOW")) {
			bob.setPenColor(254,255,0);
		}
		if (color.equalsIgnoreCase("BLUE")) {
			bob.setPenColor(3,0,255);
		}

		String shape = JOptionPane.showInputDialog("What shape would you like the robot to draw?");
		if (shape.equalsIgnoreCase("SQUARE")) {
			drawSquare(bob);
		}
		if (shape.equalsIgnoreCase("TRIANGLE")) {
			drawTriangle(bob);
		}
		if (shape.equalsIgnoreCase("CIRCLE")) {
			drawCircle(bob);
		}
	}
		
	static void drawSquare(Robot bob1) {
		for (int j = 0; j < 4; j++) {
			bob1.move(100);
			bob1.turn(90);
		}
	}
	static void drawTriangle(Robot bob2) {
		for (int i=0; i<3; i++) {
			bob2.turn(120);
			bob2.move(100);
		}
	}
	static void drawCircle(Robot bob3) {
		for (int h=0; h<360; h++) {
			bob3.turn(1);
			bob3.move(1);
		}
	}
}
