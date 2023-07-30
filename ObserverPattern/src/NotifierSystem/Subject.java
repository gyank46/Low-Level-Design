package NotifierSystem;

public interface Subject {
    public void notifyObserver(User user);
    public void addObserver(Observer observer);
    public void removeObserver(Observer observer);
}
