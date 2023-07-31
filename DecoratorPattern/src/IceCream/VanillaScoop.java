package IceCream;

public class VanillaScoop implements IceCream{
    public IceCream iceCream;

    public VanillaScoop(IceCream iceCream){
        this.iceCream = iceCream;
    }
    @Override
    public int cost() {
        return this.iceCream.cost()+15;
    }

    @Override
    public String descriptor() {
        return this.iceCream.descriptor()+"Added Vanilla Scoop ";
    }
}
