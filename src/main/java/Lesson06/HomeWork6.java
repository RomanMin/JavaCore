package Lesson06;

import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import java.io.IOException;
import java.net.URISyntaxException;

public class HomeWork6 {

        public static void main(String[] args) throws IOException, URISyntaxException {
                OkHttpClient client = new OkHttpClient();
                Request request = new Request.Builder()
                        .url("http://dataservice.accuweather.com/forecasts/v1/daily/5day/295212?apikey=thf8HGrKZ5oWohpnAvUVXy0NmwlLGnrd&language=ru-ru&metric=true&details=false")
                        .addHeader("accept", "application/json")
                        .build();

                Response response = client.newCall(request).execute();
                System.out.println(response.body().string());
        }
}
