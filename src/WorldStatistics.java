import java.util.*;

public class WorldStatistics {
    private final List<Country> countries;
    private final List<City> cities;


    public WorldStatistics() {
        this.countries = new ArrayList<>();
        this.cities = new ArrayList<>();
    }

    public Country findCountryByISoCode(String isoCode) {
        for (Country country : countries) {
            if (country.getCountryCode().equalsIgnoreCase(isoCode)) {
                return country;
            }
        }
        throw new NoSuchElementException("Nincs ilyen ISO kodu orszag");
    }

    public List<String> getCountriesOfContinent(String continentName) {
        List<String> contriesOfTheContinent = new ArrayList<>();
        for (Country country : countries) {
            if (country.getContinent().equals(continentName)) {
                contriesOfTheContinent.add(country.getCountryCode());
            }
        }
        return contriesOfTheContinent;
    }


    public Set<String> getCitiesOfCountry(String countryCode) {
        Set<String> cityNames = new HashSet<>();
        for (City city : cities) {
            if (city.getCityCode().equals(countryCode)) {
                cityNames.add(city.getCityName());
            }
        }
        return cityNames;
    }

    public int countAhmeds() {
        int count = 0;
        for (Country country : countries) {
            if (country.getPresident() != null && (country.getPresident().contains("Hamad") || country.getPresident().contains("Ahmad") || country.getPresident().contains("Ahmed"))) {
                count++;
            }
        }
        return count;
    }

    public String getPopularFirstLetter() {
        Map<Character, Integer> letterCount = new HashMap<>();
        for (Country country : countries) {
            char firstLetter = country.getCountryCode().charAt(0);
            letterCount.put(firstLetter, letterCount.getOrDefault(firstLetter, 0) + 1);
        }
        //  System.out.println(letterCount);
        char mostLetter = ' ';
        int maxCount = Integer.MIN_VALUE;

        for (Map.Entry<Character, Integer> entry : letterCount.entrySet()) {
            if (entry.getValue() > maxCount) {
                maxCount = entry.getValue();
                mostLetter = entry.getKey();
                ;
            }
        }

        return String.valueOf(mostLetter);
    }

    public String lastIndependentCountryCode() {
        Country lastIndependent = null;
        for (Country actual : countries) {
            if (actual.getIndependenceYear() != null && !actual.getIndependenceYear().equals("NULL")) {
                lastIndependent = actual;
                break;
            }
        }
        for (Country actual : countries) {
            if (actual.getIndependenceYear() != null && !actual.getIndependenceYear().equals("NULL")) {
                if (Integer.parseInt(lastIndependent.getIndependenceYear()) < Integer.parseInt(actual.getIndependenceYear())) {
                    lastIndependent = actual;
                }
            }
        }
        return lastIndependent == null ? "" : lastIndependent.getCountryCode();
    }


    public List<Country> getCountries() {
        return countries;
    }

    public void addCountry(Country country) {
        countries.add(country);
    }

    public List<City> getCities() {
        return cities;
    }

    public void addCity(City city) {
        cities.add(city);
    }

    @Override
    public String toString() {
        return "WorldStatistics{" + "countries=" + countries + ", cities=" + cities + '}';
    }
}
