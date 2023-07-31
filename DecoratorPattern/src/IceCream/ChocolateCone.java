package IceCream;

public class ChocolateCone implements IceCream{
    IceCream iceCream;

    public ChocolateCone(IceCream iceCream){
        this.iceCream = iceCream;
    }
    public ChocolateCone(){

    }
    @Override
    public int cost() {
        return this.iceCream!=null?this.iceCream.cost()+20:20;
    }

    @Override
    public String descriptor() {
        return iceCream!=null?iceCream.descriptor()+"Added Chocolate Cone ":"Added Chocolate cone";
    }
}
