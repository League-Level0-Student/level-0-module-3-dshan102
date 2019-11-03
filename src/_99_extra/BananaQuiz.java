//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0
package _99_extra;

import javax.swing.JOptionPane;

public class BananaQuiz
{
	
	public static void main(String[] args)
	{
		//1. ask the user if they like bananas
		String bananas = JOptionPane.showInputDialog("Do you like bananas?");
		//2. if they say no, 
			//tell them they are crazy 
			//and end quiz
		if (bananas.equalsIgnoreCase("no")) {
			System.out.println ("You are crazy.");
		}
		//3. if they say yes
		//	ask them what is their favorite hobby
		//	show a pop up that says "<your hobby> is much better with bananas!"
		else if (bananas.equalsIgnoreCase("Yes")) {
			String hobby = JOptionPane.showInputDialog("What is your favorite hobby");
			JOptionPane.showMessageDialog(null, hobby + " " + "is much better with banans!");
		}
		//4. OPTIONAL: if they say something other than “yes�? or “no�?
		//	show a pop up that says “You are bananas!�?
		else {
			System.out.println("You are bananas!");
		}
	
	}

}
