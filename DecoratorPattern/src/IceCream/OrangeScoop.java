package IceCream;

public class OrangeScoop implements IceCream{
    public IceCream iceCream;

    public OrangeScoop(IceCream iceCream){
        this.iceCream = iceCream;
    }
    @Override
    public int cost() {
        return this.iceCream.cost()+5;
    }

    @Override
    public String descriptor() {
        return this.iceCream.descriptor()+"Added Orange Scoop ";
    }
}
