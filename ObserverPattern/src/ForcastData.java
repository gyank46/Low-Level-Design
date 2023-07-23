public class ForcastData implements Observer{
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
        System.out.println("Tomorrow' Data: Temperature: "+2*temperature +" Humidity: "+1.5*humidity+" AirQuality: "+.5*airquality);
    }
}
