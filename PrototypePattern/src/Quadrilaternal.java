public class Quadrilaternal implements Prototype{
    int sideAB;
    int sideBC;
    int sideCD;
    int sideDA;

    public Quadrilaternal(int sideAB, int sideBC, int sideCD, int sideDA) {
        this.sideAB = sideAB;
        this.sideBC = sideBC;
        this.sideCD = sideCD;
        this.sideDA = sideDA;
    }

    @Override
    public String toString() {
        return "Quadrilaternal{" +
                "sideAB=" + sideAB +
                ", sideBC=" + sideBC +
                ", sideCD=" + sideCD +
                ", sideDA=" + sideDA +
                '}';
    }

    @Override
    public Prototype clone() {
        return new Quadrilaternal(this.sideAB,this.sideBC,this.sideCD,this.sideDA);
    }
}
