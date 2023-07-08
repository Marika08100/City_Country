public class City {
    private String cityName;
    private String cityCode;
    private long cityPopulation;
    Country country;


    public City(String cityName, String cityCode, long cityPopulation) {
        this.cityName = cityName;
        this.cityCode = cityCode;
        this.cityPopulation = cityPopulation;
    }
    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public String getCityCode() {
        return cityCode;
    }

    public void setCityCode(String cityCode) {
        this.cityCode = cityCode;
    }

    public long getCityPopulation() {
        return cityPopulation;
    }

    public void setCityPopulation(long cityPopulation) {
        this.cityPopulation = cityPopulation;
    }

    @Override
    public String toString() {
        return "City{" +
                "cityName='" + cityName + '\'' +
                ", cityCode='" + cityCode + '\'' +
                ", cityPopulation=" + cityPopulation +
                '}';
    }

    public void setCountry(Country country) {
    }
}
