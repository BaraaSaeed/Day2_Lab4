import java.util.Scanner;

public class Table_Powers {

	public static void main(String[] args) {

		char UserChoice = 'y';
		int UserNumber;
		Scanner scnr = new Scanner(System.in);
		do {
			System.out.println("Enter a number");
			UserNumber = scnr.nextInt();

			System.out.println("Number" + "\t" + "Square" + "\t" + "Cubed");
			System.out.println("======" + "\t" + "======" + "\t" + "======");

			for (int i = 1; i <= UserNumber; i++) {
				System.out.println(i + "\t" + i * i + "\t" + i * i * i);
			}
			System.out.println("Continue? (y/n)");
			UserChoice = scnr.next().charAt(0);
		} while (UserChoice == 'y');
		System.out.println("Exiting!");

		/*
		 * ==================Multiplication table up to the User entered
		 * number=========================
		 */
		for (int i = 1; i <= UserNumber; i++)
			System.out.print("\t" + i + "\t");
		System.out.println("");

		for (int i = 1; i <= UserNumber; i++)
			System.out.print("\t" + "=" + "\t");
		System.out.println("");

		for (int i = 1; i <= UserNumber; i++) {
			System.out.print(i + "|");
			for (int j = 1; j <= UserNumber; j++) {
				System.out.print("\t" + i * j);
				System.out.print("\t");
			}
			System.out.println("\n");
		}
		/*
		 * A method for coding bat assignment.
		 * 
		 * public boolean nearHundred(int n) { int within100; int within200; within100 =
		 * Math.abs(100 - n); within200 = Math.abs(200 - n); if ((within100 <= 10) ||
		 * (within200<= 10)) return true; else return false;
		 * 
		 * }
		 * 
		 */
	}
}
