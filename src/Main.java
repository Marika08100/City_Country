import java.io.File;
import java.io.FileNotFoundException;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        WorldStatistics worldStatistics = new WorldStatistics();
        try {
            Scanner countryScanner = new Scanner(new File("res/orszagok.txt"));
            while (countryScanner.hasNextLine()) {
                String line = countryScanner.nextLine();
                String[] parts = line.split(",");
                worldStatistics.addCountry(new Country(parts[0],
                        parts[1],
                        parts[2],
                        parts[3],
                        Double.parseDouble(parts[4]),
                        parts[5],
                        Long.parseLong(parts[6]),
                        parts[7]));
            }
            countryScanner.close();
            Scanner cityScanner = new Scanner(new File("res/varosok.txt"));
            while (cityScanner.hasNextLine()) {
                String line = cityScanner.nextLine();
                String[] parts = line.split(",");
                worldStatistics.addCity(new City(
                        parts[0],
                        parts[1],
                        Long.parseLong(parts[2])));
                cityScanner.close();
            }
        } catch (FileNotFoundException e) {
            System.out.println("Hiba a fajlok beolvasasanal");
        }

          Country country = worldStatistics.findCountryByISoCode("HUN");
        if(country!= null){
            System.out.println(country.getPopulationDensity());
            System.out.println(country.getRuralPopulation());
        }
        List<String> countryCities = worldStatistics.getCountriesOfContinent("Europa");
        System.out.println(countryCities);

    }
}