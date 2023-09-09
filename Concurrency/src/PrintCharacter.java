public class PrintCharacter implements Runnable{
    char c;

    PrintCharacter(char c){
        this.c = c;
    }
    @Override
    public void run() {
        System.out.println(c+" "+Thread.currentThread().getName());
    }
}
