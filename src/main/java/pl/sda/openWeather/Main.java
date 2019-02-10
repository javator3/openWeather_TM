package pl.sda.openWeather;

import com.fasterxml.jackson.databind.ObjectMapper;
import pl.sda.openWeather.model.Weather;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

public class Main {
    private static String town = "Torun";
    private static String apiURL = "http://api.apixu.com/v1/current.json?key=62ec45207b3a45858ca90607191002&q=";
    private static String filePath = "weather.json";

    public static void main(String[] args) {
        String apiAndTownURL = apiURL + town;

        try {
            URL url = new URL(apiAndTownURL);
            ObjectMapper objectMapper = new ObjectMapper();
            Weather weather = objectMapper.readValue(url,Weather.class);
            System.out.println(weather);
            File file = new File(filePath);
            objectMapper.writeValue(file,weather);

        } catch (IOException e) {
            e.printStackTrace();
        }finally {
        }

    }
}
