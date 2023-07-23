import java.util.ArrayList;
import java.util.List;

public class WeatherData implements Subject{

    List<Observer> observerList = new ArrayList<>();
    private float humidity;
    private float airquality;
    private float temperature;

    public void setHumidity(float humidity) {
        this.humidity = humidity;
    }

    public void setAirquality(float airquality) {
        this.airquality = airquality;
    }

    public void setTemperature(float temperature) {
        this.temperature = temperature;
    }

    @Override
    public void addObserver(Observer observer) {
        observerList.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observerList.remove(observer);
    }

    @Override
    public void notifyObserver() {
        for(Observer observer:observerList){
            observer.update(temperature,humidity,airquality);
        }
    }

    public void update(float humidity,float temperature,float airquality){
        setAirquality(airquality);
        setHumidity(humidity);
        setTemperature(temperature);
        notifyObserver();
    }
}
