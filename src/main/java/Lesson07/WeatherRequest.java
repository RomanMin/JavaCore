package Lesson07;

import com.fasterxml.jackson.databind.ObjectMapper;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

import java.io.IOException;

public class WeatherRequest {

    public static void main(String[] args) throws IOException {

        getWeatherData ();
    }



    public static void getWeatherData() throws IOException {
        OkHttpClient client = new OkHttpClient();
        Request request = new Request.Builder()
                .url("http://dataservice.accuweather.com/forecasts/v1/daily/5day/295212?apikey=thf8HGrKZ5oWohpnAvUVXy0NmwlLGnrd&language=ru-ru&metric=true")
                .addHeader("accept", "application/json")
                .build();

        Response response = client.newCall(request).execute();
        System.out.println(response.body().string());
    }


}
