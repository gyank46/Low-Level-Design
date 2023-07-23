public class Client {

    public static void main(String[] args) {
        Car car = Car.getBuilder().setBody("Body Added").setBrand("Brand Added").setEngine("Engine added").setSoundSystem("Sound System added").setSeats(6).setLights(10).build();
        System.out.println(car.toString());

        CarBuilder sedanBuilder = new SedanCarBuilder().setBody().setBrand().setEngine().setLights().setSeats().setSoundSystem();
        Car sedanCar = sedanBuilder.getResult();
        System.out.println(sedanCar.toString());

        CarBuilder luxuryCarBuilder = new LuxuryCarBuilder().setBody().setEngine().setBrand().setSeats().setLights().setSoundSystem();
        Car luxuryCar = luxuryCarBuilder.getResult();
        System.out.println(luxuryCar.toString());

    }

}
