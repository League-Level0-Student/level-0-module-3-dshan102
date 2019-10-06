//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

package _01_robot_color_chooser;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

import java.awt.Color;
import java.util.Random;

public class RobotColorChooser {
	public static void main(String[] args) {
		//1. Create a new Robot
		Robot bob = new Robot();
	for (int i=0; i<5; i++) {
		//3. Ask the user what color they would like the robot to draw
		String color = JOptionPane.showInputDialog("What color would you like the robot to draw?");
		
		//5. Use an if/else statement to set the pen color that the user requested
		if (color.equalsIgnoreCase("green")) {
			bob.setPenColor(Color.GREEN);
		}
        //6. If the user doesn’t enter anything, choose a random color
		else {
			bob.setRandomPenColor();
		}

        //7. Put a loop around your code so that you keep asking the user for more colors & drawing them
		
		//4. Set the pen width to 10
		bob.setPenWidth(10);
		
	    //2. Make the robot draw a shape (this will take more than one line of code)
		bob.setSpeed(100);
		bob.penDown();
		for (int j=0; j<4; j++) {
			bob.move(100);
			bob.turn(90);
		}
	}


	}
}
