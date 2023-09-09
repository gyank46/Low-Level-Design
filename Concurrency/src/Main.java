import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {
    public static void main(String[] args) {

//        String s = "My Name is Gyani Baba. I am from Jehanabad Bihar India. I am currently working as SDE.";
//        ExecutorService executor = Executors.newFixedThreadPool(20);
//        for(int i=0;i<s.length();i++){
////            Thread t = new Thread(new PrintCharacter(s.charAt(i)));
////            t.start();
//            executor.execute(new PrintCharacter(s.charAt(i)));
//
//        }
//        executor.shutdown();

        ExecutorService oddExecutorService = Executors.newSingleThreadExecutor();
        ExecutorService evenExecutorService = Executors.newSingleThreadExecutor();

        for(int i=0;i<100;i++){
            if(i%2==0)
                evenExecutorService.execute(new PrintNumber(i));
            else
                oddExecutorService.execute(new PrintNumber(i));
        }
        evenExecutorService.shutdown();
        oddExecutorService.shutdown();

    }
}

/*

Runnable interface to class for thread object
Executor will decide when to create thread and how many threads to create


 */