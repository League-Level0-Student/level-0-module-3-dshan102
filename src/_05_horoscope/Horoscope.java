package _05_horoscope;

import javax.swing.JOptionPane;

public class Horoscope {
public static void main(String[] args) {
	String sign = JOptionPane.showInputDialog("What is your star sign?");
	if (sign.equalsIgnoreCase("Aries")) {
		JOptionPane.showMessageDialog(null, "Aeries is full of life and possesses high energy.");
	}
	if (sign.equalsIgnoreCase("Taurus")) {
		JOptionPane.showMessageDialog(null, "Taurus is peaceful and methodical.");
	}
	if (sign.equalsIgnoreCase("Gemini")) {
		JOptionPane.showMessageDialog(null, "Gemini never like to be alone.");
	}
	if (sign.equalsIgnoreCase("Cancer")) {
		JOptionPane.showMessageDialog(null, "Typical cancer are very dedicated and loyal to friends and family.");
	}
	if (sign.equalsIgnoreCase("Leo")) {
		JOptionPane.showMessageDialog(null, "The best characteristics of Leo include: proud, regal, relaxed, and in charge.");
	}
	if (sign.equalsIgnoreCase("Virgo")) {
		JOptionPane.showMessageDialog(null, "Virgo are mild mannered on the surface, but underneath, there is a flurry of activity.");
	}
	if (sign.equalsIgnoreCase("Libra")) {
		JOptionPane.showMessageDialog(null, "Libra tend to need balance in their life.");
	}
	if (sign.equalsIgnoreCase("Scorpio")) {
		JOptionPane.showMessageDialog(null, "Scorpio signs are usually peaceful unless provoked.");
	}
	else {
		JOptionPane.showMessageDialog(null, "That's not a star sign!");
	}
		
}
}
