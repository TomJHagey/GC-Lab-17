import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CountriesFileUtil {

	private static Path filePath = Paths.get("countries.txt");

	public static void appendToFile(Country country) throws IOException {
		if (Files.notExists(filePath)) {
			Files.createFile(filePath);
		}
		
		String country1 = country.getName() + "," + country.getPopulation();
		List<String> countryList = Arrays.asList(country1);
		
		Files.write(filePath, countryList, StandardOpenOption.APPEND);
		
		
	}

	public static List<Country> readFile() throws IOException {
		List<String> lines = Files.readAllLines(filePath);
		List<Country> country = new ArrayList<>();
		
		for (String line : lines) {
			String[] parts = line.split(",");
			Country c = new Country(parts[0], Integer.parseInt(parts[1]));
			country.add(c);
		}
		return country;

	}

}