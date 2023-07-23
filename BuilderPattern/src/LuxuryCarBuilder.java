public class LuxuryCarBuilder implements CarBuilder{
    private Car car;
    public LuxuryCarBuilder(){
        car = new Car();
    }
    @Override
    public CarBuilder setEngine() {
        car.Engine = "Luxury Engine";
        return this;
    }

    @Override
    public CarBuilder setBody() {
        car.Body = "Luxury Body";
        return this;
    }

    @Override
    public CarBuilder setSoundSystem() {
        car.SoundSystem = "Luxury Sound System";
        return this;
    }

    @Override
    public CarBuilder setBrand() {
        car.Brand = "Luxury Brand";
        return this;
    }

    @Override
    public CarBuilder setLights() {
        car.Lights =  15;
        return this;
    }

    @Override
    public CarBuilder setSeats() {
        car.Seats = 2;
        return this;
    }
    @Override
    public Car getResult() {
        return car;
    }
}
