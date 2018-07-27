import java.util.Scanner;

public class CountryTest {
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter no of countries ");
		// Taking One Input
		int n = scanner.nextInt();
		Country country[] = new Country[n];
		for (int i = 0; i < n; i++) {
			country[i] = new Country();
		}
		for (int i = 0; i < n; i++) {
			System.out.println("Enter the name of " + (i + 1) + "country ");
			country[i].setCountryName(scanner.next());

			System.out.println("Enter the population of " + (i + 1) + "country ");
			country[i].setPopulation(scanner.nextDouble());

			System.out.println("Enter the area of " + (i + 1) + "country ");
			country[i].setArea(scanner.nextDouble());
		}
		// Finding Country with maximumarea
		double maximum = country[0].getArea();
		String maximumArea = "0";
		for (int i = 0; i < n; i++) {
			if (maximum < country[i].getArea()) {
				maximum = country[i].getArea();
				maximumArea = country[i].getCountryName();
			}
			System.out.println(maximumArea + " is country with maximum area.");
		}
		// Finding Country with maximum population density
		double populationDensity[] = new double[n];
		for (int i = 0; i < n; i++) {
			populationDensity[i] = country[i].getArea() / country[i].getPopulation();
		}
		double maximumPopDensity = populationDensity[0];
		String maximumpopDensity = "0";
		for (int i = 0; i < n; i++) {
			if (maximumPopDensity < populationDensity[i]) {
				maximumPopDensity = populationDensity[i];
				maximumpopDensity = country[i].getCountryName();
			}
		}
		System.out.println(maximumpopDensity + " is country with maximum population Density.");
		// Finding Country with maximum population
		double maxPop = country[0].getArea();
		String maxPopulation = "0";
		for (int i = 0; i < n; i++) {
			if (maxPop < country[i].getPopulation()) {
				maxPop = country[i].getPopulation();
				maxPopulation = country[i].getCountryName();
			}
		}
		System.out.println(maxPopulation + " is country with maximum population.");
		scanner.close();
	}
}
