import java.io.IOException;
import java.util.List;
import java.util.Scanner;

public class CountriesApp {

	//I do not understand how to use conditional statements when multiple classes are being employed :(
	
	
	public static void main(String[] args) throws IOException {
		Scanner scan = new Scanner(System.in);
		
		
			// System.out.println("Press 1: See list of countries. Press 2: Enter a country
			// and its population. Press 3: exit");

			System.out.println("Enter Country: ");
			String name = scan.nextLine();

			System.out.println("Enter Population: ");
			int population = scan.nextInt();

			Country p1 = new Country(name, population);
			CountriesFileUtil.appendToFile(p1);

			// System.out.println(CountriesFileUtil.readFile());
			System.out.println("List:countries,populations: ");
			List<Country> listOfCountries = CountriesFileUtil.readFile();

			for (Country c : listOfCountries) {
				System.out.println(c);
			}

			
			scan.close();
		}
	}


