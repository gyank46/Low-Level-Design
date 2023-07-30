package WeatherDataExample;

public class Statistics implements Observer{
    private float humidity;
    private float airquality;
    private float temperature;
    @Override
    public void update(float temp, float humidity, float airq) {
        this.airquality=airq;
        this.humidity = humidity;
        this.temperature = temp;
        display();
    }

    private void display() {
        System.out.println("Average is "+(humidity+temperature+airquality)/3);
    }
}
