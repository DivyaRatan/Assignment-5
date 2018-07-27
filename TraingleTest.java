import java.util.Scanner;

public class TraingleTest {
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);

		Traingle traingle = new Traingle();

		System.out.println("Enter the first side");
		String Side1 = scanner.nextLine();
		System.out.println("Enter the Second side");
		String Side2 = scanner.nextLine();
		System.out.println("Enter the Third side");
		String Side3 = scanner.nextLine();
		// Checking type of traingle
		System.out.println("Is the traingle is right " + traingle.isRight());
		System.out.println("Is the traingle is equilateral " + traingle.isEquilateral());
		System.out.println("Is the traingle is isosceles " + traingle.isIsoceles());
		System.out.println("Is the traingle is scalane " + traingle.isScalane());

	}
}
