package _04_are_you_happy;

import javax.swing.JOptionPane;

public class Are_You_Happy {
public static void main(String[] args) {
	String happy = JOptionPane.showInputDialog("Are you happy?");
	if (happy.equalsIgnoreCase("yes")) {
		JOptionPane.showMessageDialog(null, "Keep doing what you're doing.");
	}
	if (happy.equalsIgnoreCase("no")) {
		String happy1 = JOptionPane.showInputDialog("Do you want to be happy?");
		if(happy1.equalsIgnoreCase("yes")) {
			JOptionPane.showMessageDialog(null, "Change something.");
		if(happy1.equalsIgnoreCase("no")) {
			JOptionPane.showMessageDialog(null, "Keep doing whatever you're doing.");
		}
	}
	}
}
}
