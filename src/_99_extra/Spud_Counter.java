package _99_extra;

public class Spud_Counter {
public static void main(String[] args) {
	for (int i=1; i<=8; i++) {
		if (i==4) {
		System.out.print(i+", ");
	}
		else if (i==8) {
			System.out.print("more");
		}
		else {
			System.out.print(i+" "+"potato, ");
		}
	}
}
}
