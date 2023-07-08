import java.util.*;

public class WorldStatistics {
    private List<Country> countries;
    private List<City> cities;


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
        return null;
    }

    public List<String> getCountriesOfContinent(String continentName) {
        List<String> countryCodes = new ArrayList<>();
        for (Country country : countries) {
            if (country.getContinent().equalsIgnoreCase(continentName)) {
                countryCodes.add(country.getCountryCode());
            }
        }
        return countryCodes;
    }

    public Set<String> getCitiesOfCountry(String countryCode) {
        Set<String> cityNames = new HashSet<>();
        for (City city : cities) {
            if (city.getCityCode().equalsIgnoreCase(countryCode)) {
                cityNames.add(city.getCityName());
            }
        }
        return cityNames;
    }

    public int countAhmeds() {
        int count = 0;
        for (Country country : countries) {
            if (country.getPresident().contains("Hamad") ||
                    country.getPresident().contains("Ahmad") ||
                    country.getPresident().contains("Ahmed")) {
                count++;
            }
        }
        return count;
    }

    public String getPopularFirstLetter() {
        return null;
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
        return "WorldStatistics{" +
                "countries=" + countries +
                ", cities=" + cities +
                '}';
    }
}
