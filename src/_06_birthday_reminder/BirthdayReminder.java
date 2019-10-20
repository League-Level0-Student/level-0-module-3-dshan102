
//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

package _06_birthday_reminder;

import javax.swing.JOptionPane;

public class BirthdayReminder {

	public static void main(String[] args) {
	
		// 1. correct the birthdays for your family below
		String momsBirthday = "March 25th";
		String dadsBirthday = "September 11th";
		String myBirthday = "June 19th";

		// 2. Find out which birthday the user wants and and store their response in a variable
		String birthday = JOptionPane.showInputDialog("Whose birthday would you like to hear?");
		// 3. Print out what the user typed
		
		// 4. if user asked for "mom"
			//print mom's birthday
		if (birthday.equalsIgnoreCase("mom")) {
			System.out.println("March 25th");
		}
		
		// 5. if user asked for "dad"
			// print dad's birthday
		else if (birthday.equalsIgnoreCase("dad")) {
			System.out.println("September 11th");
		}
		// 6. if user asked for your name
			// print myBirthday
		else if (birthday.equalsIgnoreCase("me")) {
			System.out.println("June 19th");
		}
		//7. otherwise print "Sorry, i don't remember that person's birthday!"
		else {
			System.out.println("Sorry, I don't remember that person's birthday.");
		}

	} 
}
