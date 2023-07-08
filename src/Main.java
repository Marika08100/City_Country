import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

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
                        parts.length > 7 ?
                                parts[7] : null));

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
            }
            cityScanner.close();
        } catch (FileNotFoundException e) {
            System.out.println("Hiba a fajlok beolvasasanal");
        }

        Country country = worldStatistics.findCountryByISoCode("HUN");
        System.out.println(worldStatistics.findCountryByISoCode("HUN"));
        System.out.println("Népsűrűség: " + country.getPopulationDensity());
        System.out.println("Rurális népesség: " + country.getRuralPopulation());

        System.out.println("Europe országkódjai: " + worldStatistics.getCountriesOfContinent("Europe"));

        System.out.println("Magyarország városai: " + worldStatistics.getCitiesOfCountry("HUN"));


        System.out.println("Ahmed névű elnökök száma: " + worldStatistics.countAhmeds());

        System.out.println("A leggyakoribb kezdőbetű: " + worldStatistics.getPopularFirstLetter());

        System.out.println("Legutoljára függetlenedett ország: " + worldStatistics.lastIndependentCountryCode());


        City city = new City("Budapest", "HUN", 1779000);
        if (country != null) {
            city.setCountry(country);
            if (city.getPopulationPercentage() != -1) {
                System.out.println("A város populációja az anyaországéhoz viszonyítva: " + city.getPopulationPercentage() + "%");
            } else {
                System.out.println("Nincs elegendő adat a számításhoz.");
            }
        } else {
            System.out.println("Nem található ország az adott országkóddal.");
        }
    }
}

