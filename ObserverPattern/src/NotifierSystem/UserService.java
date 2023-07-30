package NotifierSystem;

import java.util.ArrayList;
import java.util.List;

public class UserService implements Subject{
    public List<Observer> observerList = new ArrayList<>();

    @Override
    public void notifyObserver(User user) {
        for(Observer observer:observerList){
            observer.sendNotification(user);
        }
    }

    @Override
    public void addObserver(Observer observer) {
        observerList.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observerList.remove(observer);
    }

    public void signInUser(User user){
        System.out.println("User has signed In "+user.Name);
        notifyObserver(user);
    }

    public void signOut(User user){
        System.out.println("User has signed out "+user.Name);
        notifyObserver(user);
    }
}
