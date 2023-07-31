package IceCream;

public class ChocolateScoop implements IceCream{
    public IceCream iceCream;

    public ChocolateScoop(IceCream iceCream){
        this.iceCream = iceCream;
    }
    @Override
    public int cost() {
        return this.iceCream.cost()+25;
    }

    @Override
    public String descriptor() {
        return this.iceCream.descriptor()+"Added Chocolate Scoop ";
    }
}
