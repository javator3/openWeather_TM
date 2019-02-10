package pl.sda.openWeather;

import pl.sda.openWeather.model.Weather;
import java.util.Scanner;

public class Main {

    private static String apiURL = "http://api.apixu.com/v1/current.json";
    private static String apiKey = "62ec45207b3a45858ca90607191002";

    public static void main(String[] args) {
        //Creating a object of WeatherService
        WeatherService weatherService = new WeatherService(apiURL, apiKey);
        //Get a name of town form user (command line)
        System.out.println("Podaj miasto dla którego chcesz pobrać pogodę :");
        Scanner scanner = new Scanner(System.in);
        String town;
        while (!(town = scanner.nextLine()).equals("")) {
            // Connect to API and get information
            Weather cityWeather = weatherService.getCityWeather(town);
            //Show information from api in commandline
            if (cityWeather != null) {
                System.out.println("Temperatura dla miasta " + town + " wynosi :" + cityWeather.getCurrent().getTemp_c());
                System.out.println("Czy chcesz zapisać do pliku (T/N)?");
                if (scanner.nextLine().equals("T")) {
                    //If user type T
                    //Save this information as "town_name".json file. Return true when writing was successful
                    if (weatherService.saveWeatherInFile(town)) {
                        System.out.println("Zapis do pliku zakończył się sukcesem");
                    } else {
                        System.out.println("Zapis do pliku nie powieódł się ");
                    }
                }
            }
            System.out.println("Podaj kolejne miasto :");
        }


    }
}
