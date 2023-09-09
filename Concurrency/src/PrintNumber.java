public class PrintNumber implements Runnable{
    int n;

    PrintNumber(int n){
        this.n= n;
    }

    public void run(){
        System.out.println(n);
    }
}
