package IceCream;

public class Client {
    public static void main(String[] args) {
        IceCream iceCream = new ChocolateCone();
        System.out.println(iceCream.cost());
        System.out.println(iceCream.descriptor());

        iceCream = new VanillaCone(iceCream);
        System.out.println(iceCream.cost());
        System.out.println(iceCream.descriptor());

        iceCream = new ChocolateScoop(iceCream);
        System.out.println(iceCream.cost());
        System.out.println(iceCream.descriptor());

        iceCream = new VanillaScoop(iceCream);
        System.out.println(iceCream.cost());
        System.out.println(iceCream.descriptor());

        iceCream = new OrangeScoop(iceCream);
        System.out.println(iceCream.cost());
        System.out.println(iceCream.descriptor());

    }
}
