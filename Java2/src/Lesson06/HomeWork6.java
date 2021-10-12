package Lesson06;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URISyntaxException;
import java.net.URL;

import static java.nio.charset.StandardCharsets.UTF_8;

public class HomeWork6 {

        public static void main(String[] args) throws IOException, URISyntaxException {

                URL url1 = new URL("http://dataservice.accuweather.com/forecasts/v1/daily/5day/295212?apikey=thf8HGrKZ5oWohpnAvUVXy0NmwlLGnrd&language=en-us&metric=true");

                InputStream in = url1.openStream();
                new BufferedReader(new InputStreamReader(in, UTF_8))
                        .lines()
                        .forEach(System.out::println);


        }
}
