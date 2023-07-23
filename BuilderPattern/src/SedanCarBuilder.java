public class SedanCarBuilder implements CarBuilder{
    private Car car;
    public SedanCarBuilder(){
        car = new Car();
    }
    @Override
    public CarBuilder setEngine() {
        car.Engine = "Sedan Engine";
        return this;
    }

    @Override
    public CarBuilder setBody() {
        car.Body = "Sedan Body";
        return this;
    }

    @Override
    public CarBuilder setSoundSystem() {
        car.SoundSystem = "Sedan Sound System";
        return this;
    }

    @Override
    public CarBuilder setBrand() {
        car.Brand = "Sedan Brand";
        return this;
    }

    @Override
    public CarBuilder setLights() {
        car.Lights =  5;
        return this;
    }

    @Override
    public CarBuilder setSeats() {
        car.Seats = 6;
        return this;
    }
    @Override
    public Car getResult() {
        return car;
    }
}
