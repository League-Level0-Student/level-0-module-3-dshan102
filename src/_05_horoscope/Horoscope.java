package _05_horoscope;

import javax.swing.JOptionPane;

public class Horoscope {
	public static void main(String[] args) {
		String sign = JOptionPane.showInputDialog("What is your star sign?");
		if (sign.equalsIgnoreCase("Aries")) {
			JOptionPane.showMessageDialog(null, "Aeries is full of life and possesses high energy.");
		}
		else if (sign.equalsIgnoreCase("Taurus")) {
			JOptionPane.showMessageDialog(null, "Taurus is peaceful and methodical.");
		}
		else if (sign.equalsIgnoreCase("Gemini")) {
			JOptionPane.showMessageDialog(null, "Gemini never like to be alone.");
		}
		else if (sign.equalsIgnoreCase("Cancer")) {
			JOptionPane.showMessageDialog(null, "Typical cancer are very dedicated and loyal to friends and family.");
		}
		else if (sign.equalsIgnoreCase("Leo")) {
			JOptionPane.showMessageDialog(null,
					"The best characteristics of Leo include: proud, regal, relaxed, and in charge.");
		}
		else if (sign.equalsIgnoreCase("Virgo")) {
			JOptionPane.showMessageDialog(null,
					"Virgo are mild mannered on the surface, but underneath, there is a flurry of activity.");
		}
		else if (sign.equalsIgnoreCase("Libra")) {
			JOptionPane.showMessageDialog(null, "Libra tend to need balance in their life.");
		}
		else if (sign.equalsIgnoreCase("Scorpio")) {
			JOptionPane.showMessageDialog(null, "Scorpio signs are usually peaceful unless provoked.");
		}
		else if (sign.equalsIgnoreCase("Sagittarius")) {
			JOptionPane.showMessageDialog(null,
					"Sagittarians are highly intelligent and love to be around intelligent people.");
		}
		else if (sign.equalsIgnoreCase("Capricorn")) {
			JOptionPane.showMessageDialog(null,
					"Capricorn people are the type that are goal oriented and driven to succeed despite all odds.");
		}
		else if (sign.equalsIgnoreCase("Aquarius")) {
			JOptionPane.showMessageDialog(null, "Aquarians are often generous with their time and resources. ");

		}
		else if (sign.equalsIgnoreCase("Pisces")) {
			JOptionPane.showMessageDialog(null,
					"Pisces tend to be daydreamers, often dreaming up brilliant ideas and plans.");
		}

		else {
			JOptionPane.showMessageDialog(null, "That's not a star sign!");
		}

	}
}
