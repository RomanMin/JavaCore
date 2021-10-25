package Lesson07;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class WeatherResponse {
    private String CITY;
    private String DATE;
    private String WEATHER_TEXT;
    private double TEMPERATURE;
    private String selectedDayWeather;

    private WeatherResponse(String CITY, String DATE, String WEATHER_TEXT, double TEMPERATURE){
        this.CITY = CITY;
        this.DATE = DATE;
        this.WEATHER_TEXT = WEATHER_TEXT;
        this.TEMPERATURE = TEMPERATURE;

    }
    public String getWeatherResponse(){ return  selectedDayWeather;}
    public  void setSWeatherResponse (String selectedDayWeather) { this.selectedDayWeather = selectedDayWeather;}
}
