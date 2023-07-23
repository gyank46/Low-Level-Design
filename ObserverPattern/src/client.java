public class client {

    public static void main(String[] args) {
        System.out.println("Hello world!");
        WeatherData weatherData = new WeatherData();
        Observer displayData = new DisplayData();
        weatherData.addObserver(displayData);
        Observer statistic = new Statistics();
        weatherData.addObserver(statistic);
        Observer forcast = new ForcastData();
        weatherData.addObserver(forcast);
        weatherData.update(12.5f,98.6f,4f);
//        weatherData.removeObserver(displayData);
        weatherData.update(2.5f,9.6f,2.4f);
    }
}
