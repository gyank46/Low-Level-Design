package IceCream;

public class VanillaCone implements IceCream{
    IceCream iceCream;

    public VanillaCone(IceCream iceCream){
        this.iceCream = iceCream;
    }
    public VanillaCone(){

    }
    @Override
    public int cost() {
        return iceCream!=null?this.iceCream.cost()+10:10;
    }

    @Override
    public String descriptor() {
        return iceCream!=null?iceCream.descriptor()+"Added Vanilla Cone ":"Added Vanilla cone ";
    }
}
