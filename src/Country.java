import java.util.*;

class Country {
    private String countryCode;
    private String countryName;
    private String continent;
    private String region;
    private double area;
    private String independenceYear;
    private long population;
    private String president;
    private List<City> cities = new ArrayList<>();

    public Country(String countryCode, String countryName, String continent, String region, double area,
                   String independenceYear, long population, String president) {
        this.countryCode = countryCode;
        this.countryName = countryName;
        this.continent = continent;
        this.region = region;
        this.area = area;
        this.independenceYear = independenceYear;
        this.population = population;
        this.president = president;
        this.cities = new ArrayList<>();
    }
    public double getPopulationDensity(){
        if(isUndefined()){
            return -1;
        }
        return population / area;

    }

    private boolean isUndefined() {
        return area == 0 || population == 0;
    }

    public double getRuralPopulation(){
        long ruralPopulation = 0;
        for(City city : cities){
            System.out.println(city);
            ruralPopulation += city.getCityPopulation();
        }
        return population - ruralPopulation;
    }



    public String getCountryCode() {
        return countryCode;
    }

    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }

    public String getCountryName() {
        return countryName;
    }

    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }

    public String getContinent() {
        return continent;
    }

    public void setContinent(String continent) {
        this.continent = continent;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public String getIndependenceYear() {
        return independenceYear;
    }

    public void setIndependenceYear(String independenceYear) {
        this.independenceYear = independenceYear;
    }

    public long getPopulation() {
        return population;
    }

    public void setPopulation(long population) {
        this.population = population;
    }

    public String getPresident() {
        return president;
    }

    public void setPresident(String president) {
        this.president = president;
    }

    public List<City> getCities() {
        return cities;
    }

    public void addCity(City city) {
      this.cities.add(city);
    }

    @Override
    public String toString() {
        return "Country{" +
                "countryCode='" + countryCode + '\'' +
                ", countryName='" + countryName + '\'' +
                ", continent='" + continent + '\'' +
                ", region='" + region + '\'' +
                ", area=" + area +
                ", independenceYear='" + independenceYear + '\'' +
                ", population=" + population +
                ", president='" + president + '\'' +
                ", cities=" + cities +
                '}';
    }
}

