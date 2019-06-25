import java.util.Scanner;

public class Table_Powers {

	public static void main(String[] args) {

		char UserChoice = 'y';
		Scanner scnr = new Scanner(System.in);
		do {
			System.out.println("Enter a number");
			int UserNumber = scnr.nextInt();

			System.out.println("Number	Square	Cubed");
			System.out.println("======	======	======");

			for (int i = 1; i <= UserNumber; i++) {
				System.out.println(i + "\t" + i * i + "\t" + i * i * i);
			}
			System.out.println("Continue? (y/n)");
			UserChoice = scnr.next().charAt(0);
		} while (UserChoice == 'y');
		System.out.println("Exiting!");
	}

}
