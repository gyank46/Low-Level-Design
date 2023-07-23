public interface CarBuilder {

    public CarBuilder setEngine();
    public CarBuilder setBody();
    public CarBuilder setSoundSystem();
    public CarBuilder setBrand();
    public CarBuilder setLights();
    public CarBuilder setSeats();

    public Car getResult();

}
