public class Car {
    public String Brand;
    public String Engine;
    public String Body;
    public String SoundSystem;
    public int Seats;
    public int Lights;

    @Override
    public String toString() {
        return "Car{" +
                "Brand='" + Brand + '\'' +
                ", Engine='" + Engine + '\'' +
                ", Body='" + Body + '\'' +
                ", SoundSystem='" + SoundSystem + '\'' +
                ", Seats=" + Seats +
                ", Lights=" + Lights +
                '}';
    }
    public Car(){

    }
    private Car(CarBuilder builder){
        this.Brand = builder.Brand;
        this.Engine = builder.Engine;
        this.Body = builder.Body;
        this.SoundSystem = builder.SoundSystem;
        this.Seats = builder.Seats;
        this.Lights = builder.Lights;

    }

    public static CarBuilder getBuilder(){
        return new CarBuilder();
    }

    public static class CarBuilder{
        private String Brand;
        private String Engine;
        private String Body;
        private String SoundSystem;
        private int Seats;
        private int Lights;

        private CarBuilder(){

        }
        public CarBuilder setBrand(String brand){
            this.Brand = brand;
            return  this;
        }

        public CarBuilder setEngine(String engine){
            this.Engine = engine;
            return  this;
        }
        public CarBuilder setBody(String body){
            this.Body = body;
            return  this;
        }
        public CarBuilder setSoundSystem(String soundSystem){
            this.SoundSystem = soundSystem;
            return  this;
        }
        public CarBuilder setSeats(int seats){
            this.Seats = seats;
            return  this;
        }

        public CarBuilder setLights(int lights){
            this.Lights = lights;
            return  this;
        }

        public Car build(){
            return new Car(this);
        }



    }
}
