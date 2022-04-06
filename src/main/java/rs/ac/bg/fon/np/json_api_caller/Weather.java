package rs.ac.bg.fon.np.json_api_caller;

public class Weather {
	private String city;
	private String country;
	private String region;
	private int temperature;
	private String weatherDescription;
	private int windSpeed;
	private boolean isDay;
	
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getRegion() {
		return region;
	}
	public void setRegion(String region) {
		this.region = region;
	}
	public int getTemperature() {
		return temperature;
	}
	public void setTemperature(int temperature) {
		this.temperature = temperature;
	}
	public String getWeatherDescription() {
		return weatherDescription;
	}
	public void setWeatherDescription(String weatherDescription) {
		this.weatherDescription = weatherDescription;
	}
	public int getWindSpeed() {
		return windSpeed;
	}
	public void setWindSpeed(int windSpeed) {
		this.windSpeed = windSpeed;
	}
	public boolean isDay() {
		return isDay;
	}
	public void setDay(boolean isDay) {
		this.isDay = isDay;
	}
	@Override
	public String toString() {
		return "--- Weather --- \nCity: " + city + "\nCountry: " + country + "\nRegion: " + region + "\nTemperature: " + temperature
				+ "\nWeather description: " + weatherDescription + "\nWind speed: " + windSpeed + "\nIs day: " + isDay;
	}
	
	
}
